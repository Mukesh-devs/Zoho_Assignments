package Assignment_1;
public class Type_conversion {
    public static void main(String[] args) {
        // Implicit Casting
        System.out.println("Implicit Type Casting : ");
    implicit();
    System.out.println();
        // Explicit Casting
        System.out.println("Explicit Type Casting : ");
    explicit();
    }
    static void implicit() {
        Byte byte_var = 65;
        short short_var = byte_var;
        char char_var = (char) short_var;
        int int_var = char_var;
        long long_var = int_var;
        float float_var = long_var;
        double double_var = float_var;
        System.out.println("byte value : " + byte_var);
        System.out.println("byte to short : " + short_var);
        System.out.println("short to char : " + char_var);
        System.out.println("char to int : " + int_var);
        System.out.println("int to long : " + long_var);
        System.out.println("long to float : " + float_var);
        System.out.println("long to double : " + double_var);
    }
    static void explicit() {
        double double_var = 65.98765432d;
        float float_var = (float) double_var;
        long long_var = (long) float_var;
        int int_var = (int) long_var;
        short short_var = (short) int_var;
        byte byte_var = (byte) short_var;
        char char_var = (char) byte_var;
        System.out.println("double value : " + double_var);
        System.out.println("double to float : " + float_var);
        System.out.println("float to long : " + long_var);
        System.out.println("long to int : " + int_var);
        System.out.println("int to short : " + short_var);
        System.out.println("short to byte : " + byte_var);
        System.out.println("byte to char : " + char_var);
    }
}


