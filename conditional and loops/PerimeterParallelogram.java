
import java.util.Scanner;

public class PerimeterParallelogram{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter length and breadth : ");
        float len = inp.nextFloat();
        float breadth = inp.nextFloat();

        double result = perimeter(len,breadth);
        System.out.print("perimeter is : " + result);
        
        
    }

    static double perimeter(float len,float breadth){
        return 2*(len+breadth);
    }

    
}