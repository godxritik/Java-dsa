
import java.util.Scanner;

public class greeting{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.println("enter your name");

        String name = input.nextLine();

        System.out.println("hello " + name + ", " + "Good Morning");
    }
}