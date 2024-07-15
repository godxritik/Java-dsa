
import java.util.Scanner;

public class AverageOfN{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("how many numbers to find average ? : ");
        int n = inp.nextInt();
        float sum=0;

        System.out.print("enter the numbers one by one to find average : ");

        for(int i =0 ; i<n; i++){
            float num = inp.nextInt();
            sum = sum+num;
        }

        float average = sum/n;
        System.out.print("the average is : " + average);
    }
}