
import java.util.Scanner;

public class Conditional{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = inp.nextInt();

        int len = String.valueOf(num).length();

        int resultProduct = productDigits(num, len);
        System.out.println("the product is : " + resultProduct);

        int resultSum = sumDigits(num, len);
        System.out.println("the sum is : " + resultSum);

        int finalAnswer = resultProduct-resultSum;

        System.out.print("the difference of digit product and sum is : " + finalAnswer);
        
        
        
    }

    static int productDigits(int num,int len){
        int temp = num;
        int product=1;
        for(int i =0; i<len;i++){
            int lastDigit = temp%10;
            product *= lastDigit;
            temp = temp/10;
        }

        return product;
    }

      static int sumDigits(int num,int len){
        int temp = num;
        int sum=0;
        for(int i =0; i<len;i++){
            int lastDigit = temp%10;
            sum += lastDigit;
            temp = temp/10;
        }

        return sum;
    }
    
}