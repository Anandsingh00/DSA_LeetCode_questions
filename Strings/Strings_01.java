package Strings;

public class Strings_01 {
    public static boolean isPalindrome(String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        String s1 =s.toLowerCase();
        for(int i = 0; i < len; i++){
            char c = s1.charAt(i);
            int ascii = (int) c;
            if((ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)){
                sb.append(c);
            }
        }


//        make a new StringBuilder
        StringBuilder sbRev = new StringBuilder(sb.length());
        for(int i = sb.length()-1 ; i >= 0 ; i--){
            char c = sb.charAt(i);
            sbRev.append(c);
        }
        return sb.toString().equals(sbRev.toString());
    }
    public static void main(String[] args) {
        String s = "abba";
        boolean ans =  isPalindrome(s);
        System.out.println(ans);
    }
}
