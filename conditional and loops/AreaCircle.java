
import java.util.Scanner;

public class AreaCircle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the radius : ");
        float radius = input.nextFloat();

        double result = areaCircle(radius);
        System.out.println("the area of circle is : " + result);

    }

    static double  areaCircle(float radius){
        double area = 3.14 * radius * radius;
        return area; 
    } 
}