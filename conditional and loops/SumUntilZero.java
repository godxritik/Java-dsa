
import java.util.Scanner;

public class SumUntilZero{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int flag =0;
        int sum =0;
        System.out.print("enter the number to add enter 0 to exit : ");
        
        while(flag==0){
                int num = inp.nextInt();
                if(num==0){
                    System.out.print("the sum is : " + sum);
                    flag+=1;
                }else{
                    sum +=num;
                }
        }
        
    }

    
}