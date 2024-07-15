import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();

        int res = sum(a,b);
        System.out.println("the sum is : " + res);

    }

    static int sum(int a, int b){
        return a+b;
    }

}
