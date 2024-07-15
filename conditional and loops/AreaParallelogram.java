
import java.util.Scanner;

public class AreaParallelogram{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter base and height of the parallelogram : ");
        float base = inp.nextFloat();
        float height = inp.nextFloat();

        double result = areaParallelogram(base, height);
        System.out.print("the area is : " + result);


    }

    static double areaParallelogram(float base, float height){
            return base*height;
    }
}