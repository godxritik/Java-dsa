
import java.util.Scanner;
public class CheckPalindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to check : ");
        int num = input.nextInt();

        int temp,sum=0,remainder;

        temp=num;

        while(num>0){
            remainder = num%10;
            sum = (sum*10) + remainder;
            num = num/10;
        }

        if(temp==sum)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");

    }
}