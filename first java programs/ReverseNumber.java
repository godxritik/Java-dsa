
import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number to reverse : ");
        int num = input.nextInt();
        int temp = num;

        int sum =0;

        int len = String.valueOf(num).length();

        for(int i=0; i<len; i++){
            int r = num%10;
            sum = (sum*10) + r;
            num = num/10;
        }

        System.out.print("the reverse is : " + sum);
    }
}
