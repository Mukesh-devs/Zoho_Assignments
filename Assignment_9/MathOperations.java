class MathOperations{
    public int add(int a, int b) {
        return a+b;
    }

    public int substract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public double add(double a, double b) {
        return a+b;
    }

    public double substract(double a,double b) {
        return a-b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public double divide(double a, double b) {
        return a/b;
    }

    public float add(float a,float b) {
        return a+b;
    }

    public float substract(float a,float b) {
        return a-b;
    }

    public float multiply(float a, float b) {
        return a*b;
    }

    private float divide(float a, float b) {
        return a/b;
    }
    

}


class Q1 extends MathOperations{
    public static void main(String[] args) {
        
        MathOperations m = new MathOperations();
        System.out.println(m.add(1,2));
        System.out.println(m.add(2.2,2));
        System.out.println(m.add(1.3f,2));
        System.out.println(m.substract(2,1));
        System.out.println(m.substract(2.2,2));
        System.out.println(m.substract(5.3f,2));
    }
}