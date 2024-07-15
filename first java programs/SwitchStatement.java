
import java.util.Scanner;

public class SwitchStatement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch(fruit){
            case "mango":
                System.out.println("king of fruits--");
                break;

            case "apple":
                System.out.println("red fruit");
                break;

            default:
                System.out.println("no matching results");
        }

        }
}