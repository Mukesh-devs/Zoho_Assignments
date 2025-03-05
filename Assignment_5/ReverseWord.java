package Assignment_5;

public class ReverseWord {
    
    public static void main(String[] args) {
        String s = " Hello World program ";
        String[] words = s.split(" ");
        String reverseString = "";
        for (int i = words.length - 1; i >= 0; i-- ) {
            String word = words[i];
            String reverseWord = "";
            reverseWord = reverseWord + word;
            
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(s);
        System.out.println(reverseString);
    }
}
