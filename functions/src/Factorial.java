import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the number for factorial : ");
        int num = inp.nextInt();
        calcFactorial(num);
    }

    static  void calcFactorial(int num){
        int fact =1;
        if (num==0) System.out.println(fact);
        else if (num==1) System.out.println(fact);
        else if (num>=2) {
            for (int i =num; i>=1;i--){
                fact = fact*i;
            }
            System.out.print("the factorial is : " + fact);
        }

    }
}
