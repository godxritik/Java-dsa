
import java.util.Scanner;

public class CalculatorFunc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("--calculator with functions--");
        System.out.println("enter two numbers");
         int num1 = input.nextInt();
         int num2 = input.nextInt();

        System.out.println("enter the operator like +,-,*,/  : ");
        char op = input.next().charAt(0);

        switch(op){
            case '+' -> Sum(num1, num2);
            case '-' -> diff(num1, num2);
            case '*' -> multiply(num1, num2);
            case '/' -> div(num1, num2);
            default -> System.out.println("invalid operator");
        }


        
    }

     static void Sum(int num1,int num2){
        System.out.println("the sum is : " + (num1+num2));

    }
    static void diff(int num1,int num2){
        System.out.println("the difference is : " + (num1-num2));

    }

    static void multiply(int num1,int num2){
        System.out.println("the product is : " + (num1*num2));

    }

    static void div(int num1,int num2){
        System.out.println("the division result is : " + (num1/num2));

    }


   

}

