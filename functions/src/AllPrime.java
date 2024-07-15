import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the starting and ending range : ");
        int start = inp.nextInt();
        int end = inp.nextInt();
        printPrime(start,end);
    }

    static void printPrime(int start,int end){
       for (int i=start;i<=end;i++){
           int flag = 0;
           for (int j=2;j<=i/2;++j){

               if (i%j==0){
                   flag =1;
                   break;
               }

           }
           if (flag==0){
               System.out.println(i + " ");
           }
       }
    }
}
