package Assignment_2;

import java.util.Scanner; 

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Celsius = sc.nextFloat();
        float Fahrenheit = (float)( Celsius * 1.8 ) + 32;    
        System.out.printf("%.1f",Fahrenheit);
    }
}
