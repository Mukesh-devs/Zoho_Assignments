package Assignment_5;

public class VowelCount {
    public static void main(String[] args) {
        
        String s = "vOwel";
        System.out.println(Vowelcount(s));
    }

    static int Vowelcount(String s) {
        var count = 0;
        for ( char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o') {
               count++;
            }
        } 
        return count;
    }
}
