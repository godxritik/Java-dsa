
import java.util.Scanner;

public class AreaTriangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the base and height of the triangle  :");
        float base = input.nextFloat();
        float height = input.nextFloat();

        double result = areaTriangle(base, height);
        System.out.println("the area of triangle is : " + result);

    }

    static double areaTriangle(float base,float height){
        double area = (base*height)/2;
        return area;
    }
}