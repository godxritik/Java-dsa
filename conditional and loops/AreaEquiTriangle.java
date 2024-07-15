
import java.util.Scanner;

public class AreaEquiTriangle{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the side : ");
        float side = inp.nextFloat();

        double result = areaTriangle(side);
        System.out.print("area is : " + result);
        
        
    }

    static double areaTriangle(float side){
        double area = (Math.sqrt(3)*side*side)/4;
        return area;
    }

    
}