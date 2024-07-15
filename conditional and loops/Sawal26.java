import java.util.Scanner;

public class Sawal26 {
    public static void main(String[] args) {
        System.out.print("enter the numbers : ");
        Scanner inp = new Scanner(System.in);
        int evenPositive =0;
        int oddPositice=0;
        int negative =0;

        int flag=0;

        while(flag==0){
            int num = inp.nextInt();
            if (num>0 && num%2==0){
                evenPositive += num;
            } else if (num>0 && num%2==1) {
                oddPositice =+num;
            } else if (num<0) {
                negative =+ num;
            } else if (num==0) {
                flag++;
            }
        }

        System.out.println("sum of even positive : " + evenPositive);
        System.out.println("sum of odd positive : " + oddPositice);
        System.out.println("sum of negative : " + negative);


    }
}
