/*
Complete the solution so that it splits the string into pairs of two characters. 
If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']

*/
public class StringSplit {
    public static String[] solution(String s) {
        int length;
        boolean even;
      
        // Calculate array size and determine if string length is even
        if (s.length() % 2 == 0) {
            length = s.length() / 2;
            even  = true;
        } else {
            length = s.length() / 2 + 1;
            even  = false;
        }
      
        String[] sarray = new String[length];
        int counter = 0;
        String chars = "";
      
        // Build pairs of characters
        for (int i = 0; i < s.length(); i++) {
            chars += s.charAt(i);
            if (i % 2 == 1) { // Complete pair found (at odd index)
                sarray[counter] = chars;
                counter++;
                chars = "";
            }
        }
      
        // Handle odd-length string: add underscore to incomplete pair
        if (!even && !chars.isEmpty()) {
            chars += "_";
            sarray[counter] = chars;
        }
      
        return sarray;
    }
}
