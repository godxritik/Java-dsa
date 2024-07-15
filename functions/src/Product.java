import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();

        int res = productNum(a,b);
        System.out.println("the product is : " + res);
    }

    static int productNum(int a, int b){
        return a*b;
    }
}
