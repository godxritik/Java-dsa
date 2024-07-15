
import java.util.Scanner;

public  class ElectricityBill{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("***the charges for 200 units is 4rs per unit above it is 7rs per unit***");
        System.out.print("enter the number of units : ");
        int units = inp.nextInt();
        int bill=0;
        int lowRate=4;  int highRate=7;

        if(units>200){

            int temp = units%200;
            bill = (200*lowRate) + (highRate*temp);
        }
        else{
            bill = units*lowRate;
        }

        System.out.print("your bill is : " + bill);

    }
}