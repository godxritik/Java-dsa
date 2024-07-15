
import java.util.Scanner;

public class CheckArmstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to check");
        int num = input.nextInt();

        int len = String.valueOf(num).length();
        // System.out.println(len);
        int temp = num;
        double sum =0;

        for(int i =0 ; i<len ; i++){
            int lastDigit = num%10;
            sum = sum + (Math.pow(lastDigit, len));
            num = num/10;
        }
            // System.out.println(2**3);

            if(temp==sum){
                System.out.println("armstrong");
            }else{
                System.out.println("not armstrong");
            }

    }
}