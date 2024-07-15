import java.util.Scanner;

public class LargestUntilZero{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int flag =0;
        int largest =0;
        System.out.print("enter the number to find largest number enter 0 to exit : ");
        
        while(flag==0){
                int num = inp.nextInt();
                if(num==0){
                    System.out.print("the largest is : " + largest);
                    flag+=1;
                }else{
                    if(num>largest){
                        largest=num;
                    }
                }
        }
    }
}