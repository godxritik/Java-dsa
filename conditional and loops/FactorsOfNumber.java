import java.util.Scanner;

public class FactorsOfNumber{
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("enter the number for factors : ");
        int num = input.nextInt();

        System.out.print("the factors are : ");
        
        for(int i =1;i<=num;i++){
            if(num%i==0){
                if(i==1){
                    
                }
                else{
                        System.out.print(i +" ");
                        num=num/i;
                        i=1;
                }
                
            }
        }


    }
}