package Assignment_5;

public class ReverseString {
    
    public static void main(String[] args) {
        
        String s = "hello";

        int len = s.length();
        String ss = "";
        for ( int i = len - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        System.out.println(ss);
    }
}
