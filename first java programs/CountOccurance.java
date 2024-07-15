import java.util.Scanner;
public  class CountOccurance{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = inp.nextInt();
        System.out.print("enter what to count ?? : ");
        int key = inp.nextInt();

        int count=0; int remainder;
        int len = String.valueOf(num).length();
        // System.out.print(len);
        

        for(int i=0; i<len; i++){
           remainder = num%10;
           num = num/10;
           if(remainder==key){
            count++;
           }
        }

        System.out.println("the key occurred " + count + " times");



    }
}