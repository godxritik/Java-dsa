
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int temp1 =0; int temp2 =1 ; int temp3 ;
        
        System.out.println("enter range");
        int range = input.nextInt();

        System.out.print(temp1+ " "+temp2 + " ");

        for(int i =2 ; i<range; i++){
             temp3 = temp1 + temp2;
             System.out.print(temp3 +" ");

             temp1 = temp2;
             temp2 = temp3;

        }
}
}