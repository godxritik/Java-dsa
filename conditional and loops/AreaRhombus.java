
import java.util.Scanner;

public class AreaRhombus{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the two diagonals : ");
        float diagonal1 = inp.nextFloat();
        float diagonal2 = inp.nextFloat();

        double result = areaRhombus(diagonal1, diagonal2);
        System.out.print("the area is : " + result);
        
    }

    static double areaRhombus(float diagonal1,float diagonal2){
        double area = (diagonal1*diagonal2)/2;
        return area;
    }
}