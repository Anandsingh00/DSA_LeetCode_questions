package Strings;

import java.util.Locale;

public class basics {
    public static void main(String[] args) {
        String s ="AEIOU";
        int i = 4;
//        System.out.println("Char at "+i+"th index: " + s.charAt(i));
//        lowerCase the input String s
        String s1 = s.toLowerCase();
        int ans = countVowel(s1);
        System.out.println("Count of vowels in " + s + ":" + ans );
//        System.out.println("Length of String s: " + s.length());
    }

    public static int countVowel(String s){
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ;
            if(c == 'a' ||  c == 'e' || c == 'i' || c == 'o'|| c == 'u' ){
                count++;
            }
        }

        return count;
    }
}
