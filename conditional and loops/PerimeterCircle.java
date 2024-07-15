
import java.util.Scanner;

public class PerimeterCircle{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the radius : ");
        float radius = inp.nextFloat();

        double result = perimeterCircle(radius);
        System.out.println("the perimeter is : " + result);
    }

    static double perimeterCircle(float radius){
        double perimeter = 2*3.14*radius;
        return perimeter;
    }
    
}