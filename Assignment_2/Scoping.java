package Assignment_2;

public class Scoping {
    public static void main(String[] args) {
        
    int Outside = 5;

        if ( Outside < 10 ) {
            int Inside = 10;
            System.out.println(Inside);
            System.out.println(Outside);
        }

    System.out.println(Outside); 
    System.out.println(Inside); //compiler error because local varibale not initialized
    }
}
