class Q1{
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Divide By Zero Is Not Possible!!");
        }
    }
}