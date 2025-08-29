public class StringSplit {
    public static String[] solution(String s) {
        int length;
        boolean par;
      
        if (s.length() % 2 == 0) {
            length = s.length() / 2;
            par = true;
        } else {
            length = s.length() / 2 + 1;
            par = false;
        }
      
        String[] sarray = new String[length];
        int contador = 0;
        String chars = "";
      
        for (int i = 0; i < s.length(); i++) {
            chars += s.charAt(i);
            if (i % 2 == 1) { // Procesar cada par de caracteres
                sarray[contador] = chars;
                contador++;
                chars = "";
            }
        }
      
        // Si la cadena es impar, `chars` contendrá el último carácter
        if (!par && !chars.isEmpty()) {
            chars += "_"; // Se añade el guion bajo para completar el par
            sarray[contador] = chars;
        }
      
        return sarray;
    }
}
