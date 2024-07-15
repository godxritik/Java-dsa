
import java.util.Scanner;

public class Discount{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the MRP and discount rate of the product : ");
        int price = inp.nextInt();
        float rate = inp.nextFloat();

        float discount = (price*rate)/100;
        System.out.println("the discount is : " + discount + " rupees");
        float costPrice = price-discount;
        System.out.println("Cost price after discount is : " + (costPrice) + " rupees");

    }
}