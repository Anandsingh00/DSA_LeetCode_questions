package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Anand";
        int n = s.length();
        StringBuilder rev = new StringBuilder(n);

        for( int i = n-1; i >= 0 ; i-- ){
            char c = s.charAt(i);
            rev.append(c);
        }

        System.out.println(rev.toString());
    }
}
