package Assignment_5;

public class Capitalize {
    public static void main(String[] args) {
        
        String s = "hello world";
        String ss = "" + Character.toUpperCase(s.charAt(0));
        for ( int i = 1; i < s.length(); i++ ) {
            ss += s.charAt(i);
            if ( s.charAt(i) == ' ') {
                ss += Character.toUpperCase(s.charAt(i + 1));
                i++;
            }
        }
        System.out.println(ss);
    }
}
