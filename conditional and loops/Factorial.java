import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the number to find factorial : ");
        int num = inp.nextInt();
        int fact = 1;

        if(num==0){
        
        }else{
            for(int i =num; i>=1; i--){
                fact = fact*i;
         }
              
        }

        System.out.println("the factorial of the " + num + " is " + fact);

       
        
    }

    
}