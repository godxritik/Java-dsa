import java.util.Scanner;

public class BattingAverage{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("etner the total runs scored by the player : ");
        int runsScored = inp.nextInt();
        System.out.print("enter the number of times the player is out : ");
        int timesOut = inp.nextInt();

        float average = runsScored/timesOut;
        System.out.print("the batting average of the player is : " + average);
    }
}