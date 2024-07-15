
import java.util.Scanner;

public  class AreaRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length and breadth of rectangle");
        int len = input.nextInt();
        int breadth = input.nextInt();

        int result = areaRect(len, breadth);
        System.out.println("the area of rectangle is : " + result + "unit square");


    }

    static int areaRect(int len, int breadth){
        return len*breadth;
    }

}