import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        float rate =  input.nextFloat();
        int time =  input.nextInt();

        float si = (principal*rate*time)/100;
        
        System.out.println("the simple interest is : " + si + " INR");

    }
}