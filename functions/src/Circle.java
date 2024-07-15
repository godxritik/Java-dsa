import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter radius : ");
        float radius = inp.nextFloat();
        float pi = 3.14f;

        double resArea = areaCircle(radius,pi);
        double resCircumference = circumferenceCircle(radius,pi);
        System.out.printf("the area is : %.2f \n" , resArea);
        System.out.printf("the circumference of circle is : %.2f " , resCircumference);

    }

    static double areaCircle(float radius, float pi){
            double area = pi*radius*radius;
            return area;
    }

    static double circumferenceCircle(float radius, float pi){
            double circumference = 2*pi*radius;
            return circumference;
    }
}
