import java.util.Scanner;

public class PerimeterEquiTriangle{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the radius : ");
        float side = inp.nextFloat();

        double result = perimeterTriangle(side);
        System.out.println("the perimeter is : " + result);
    }

    static double perimeterTriangle(float side){
        float perimeter = 3*side;
        return perimeter;
    }
    
}