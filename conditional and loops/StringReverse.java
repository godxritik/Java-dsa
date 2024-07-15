
import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the string : ");
        String original = inp.next();

        // System.out.println(original.length());

        String reversed = "";
        for(int i = original.length()-1 ; i>=0;i--){
            char x = original.charAt(i);
            reversed = reversed + x;
        }

        System.out.println("the reversed string is : " + reversed);



    }
}