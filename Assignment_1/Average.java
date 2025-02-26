package Assignment_1;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] PeopleWeight = new int[10];
        int SumWeight = 0;
        for ( int i = 0; i < PeopleWeight.length; i++) {
            System.err.print("Weight of People "+ (i+1) +" : ");
            PeopleWeight[i] = sc.nextInt();
            SumWeight += PeopleWeight[i];
        }
        int AvgWeight = SumWeight/10;
        System.out.println("Average Weight of 10 People : " + AvgWeight);
    }
}
