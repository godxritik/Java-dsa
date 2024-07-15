import java.util.Scanner;
public class INRtoUSD{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter amount in rupees ₹ : ");
        int rupees = input.nextInt();
        float usd = rupees/82.5f;

        System.out.println("Rupees to USD is : " + usd + "$");
    }
}