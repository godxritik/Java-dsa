import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = inp.nextInt();
        int sum =0;

        for(int i=1; i<=num/2 ;i++){
            if (num%i==0){
                sum +=i;
            }
        }
        if (sum==num){
            System.out.println("perfect number");
        }
        else {
            System.out.println("not perfect number");
        }


    }
}
