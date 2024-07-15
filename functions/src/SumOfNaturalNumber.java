import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the range ");
        int range = inp.nextInt();

        int res = sumOfNumbers(range);
        System.out.println("the sum of n natural number is : " + res);

    }

    static int sumOfNumbers(int range){
        int sum=0;
        for (int i=1;i<=range;i++){
            sum += i;
        }
        return sum;
    }
}
