
import java.util.Scanner;

public class PerimeterSquare{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter side of square : ");
        float side = inp.nextFloat();
    

        double result = perimeter(side);
        System.out.print("perimeter is : " + result);
        
        
    }

    static double perimeter(float side){
        return 4*side;
    }

    
}