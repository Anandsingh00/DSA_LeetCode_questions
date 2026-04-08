package Strings;

public class stringBufferBasics {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");

        //append additional content
        s1.append(" World");

        //Insert content at a specific position
        s1.insert(5," ");

        System.out.println(s1.toString());
    }
}
