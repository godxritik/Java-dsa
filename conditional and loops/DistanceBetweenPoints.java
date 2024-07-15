
import java.util.Scanner;

public class DistanceBetweenPoints{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the points X1 and X2 respectively : ");
        int X1 = inp.nextInt();
        int X2 = inp.nextInt();
        System.out.print("enter the points Y1 and Y2 respectively : ");
        int Y1 = inp.nextInt();
        int Y2 = inp.nextInt();

        double expression = Math.pow(X2-X1, 2) + Math.pow(Y2-Y1, 2);

        double distance = Math.sqrt(expression);
        System.out.printf("the distance betwen the points is : %.2f ",distance);
        
    }
}