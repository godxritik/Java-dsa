import java.util.Scanner;

public class Operators{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the two numbers and operator like +,-,*,/");
        int a = input.nextInt();
        int b = input.nextInt();

        char c = input.next().charAt(0);

        if(c=='+'){
            System.out.println(a+b);
        }
        else if(c=='-'){
            System.out.println(a-b);
        }
        else if(c=='*'){
            System.out.println(a*b);
        }
        else if(c=='/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("unexpected input !!!");
        }
    }
}