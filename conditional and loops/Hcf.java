import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the two numbers : ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int hcf = 0;

        for(int i=1; i<=a || i<=b ; i++){
            if (a%i==0 && b%i==0){
                hcf = i;

            }
        }
        System.out.println(hcf);

    }
}
