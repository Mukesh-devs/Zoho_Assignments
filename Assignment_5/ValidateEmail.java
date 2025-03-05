package Assignment_5;

public class ValidateEmail {
    public static void main(String[] args) {
        String s = "test@ddsd.cj";
        boolean isValid = false;
        int dot = 0;
        for ( int i = 0; i < s.length(); i++ ) {
            if ( s.charAt(i) == '@' ) {
                for ( int j = i + 1; j < s.length(); j++) {
                    if ( s.charAt(j) == '@') {
                        break;
                    }
                    if ( s.charAt(j) == '.' ) {
                        dot++;
                        isValid = true;
                        // break;
                    }

                }
                if ( s.charAt(s.length() - 1) == '.'){
                    isValid = false;
                }
                // break;
            }
        }
        System.out.println(dot);
        if (isValid && (dot == 1)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
