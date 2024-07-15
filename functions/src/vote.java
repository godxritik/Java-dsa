import java.util.Scanner;

public class vote {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age = inp.nextInt();

        eligibility(age);
    }

    static void eligibility(int age) {
        if (age >= 18) {
            System.out.println("yes you can vote 😊");
        }
        else {
            System.out.println("you cannot vote !!");
        }
    }


}