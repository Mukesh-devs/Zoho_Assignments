
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
class Q2 {
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        } else {
            System.out.println("Access granted.");
        }
    }
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

}
