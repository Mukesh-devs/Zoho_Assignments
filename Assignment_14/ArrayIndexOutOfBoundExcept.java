class Q5 {
    public static void main(String[] args) {
        System.out.println("The length of the args array is: "+args.length);
        try{
            System.out.print("While trying to access the 2nd element, we get : ");
            System.out.print(args[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
