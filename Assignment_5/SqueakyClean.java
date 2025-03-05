package Assignment_5;

public class SqueakyClean {
    public static void main(String[] args) {
        System.out.println(clean("my    id"));
        System.out.println(convertKebabToCamel("a-bc"));
        System.out.println(Leetspeak("4 73s7"));
        System.out.println(OmitChar("a$#.b"));
    }   

    public static String clean(String input) {
        if (input == null) {
            return null;
        }
        return input.replace(' ', '_');
    }

    public static String convertKebabToCamel(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;
        for (char c : input.toCharArray()) {
            if (c == '-') {
                toUpperCase = true;
            } else {
                if (toUpperCase) {
                    result.append(Character.toUpperCase(c));
                    toUpperCase = false;
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

        public static String Leetspeak(String input) {
            if (input == null) {
                return null;
            }
            input = input.replace(' ', '_');
            input = input.replace('4', 'a');
            input = input.replace('3', 'e');
            input = input.replace('0', 'o');
            input = input.replace('1', 'l');
            input = input.replace('7', 't');
            return input;
        }

            public static String OmitChar(String input) {
                if (input == null) {
                    return null;
                }
                StringBuilder result = new StringBuilder();
                for (char c : input.toCharArray()) {
                    if (Character.isLetter(c)) {
                        result.append(c);
                    }
                }
                return result.toString();
            }
        
}
