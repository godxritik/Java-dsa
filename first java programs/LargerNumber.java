
import java.util.Scanner;

public class LargerNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.println("num1 is  larger : "+ num1);
        }
        else{
            System.out.println("num2 is  larger : "+ num2);

        }
        
    }
}