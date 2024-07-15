import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = inp.nextInt();
        prime(num);
    }

    static void prime(int num){
        int flag=0;
        for (int i=2; i<num;i++){
            if (num%i==0){
                flag++;
            }
        }

        if (flag==0){
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}
