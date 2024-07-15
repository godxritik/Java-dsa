import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number");
        int num = inp.nextInt();

        int len = String.valueOf(num).length();
        int sum =0 ;

        for (int i =0 ;i<len; i++){
            int r = num%10;
            sum = sum + r;
           num /=10;
        }

        System.out.println(sum);

    }
}
