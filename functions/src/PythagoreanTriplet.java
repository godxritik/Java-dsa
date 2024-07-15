import java.util.Scanner;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the three numbers : ");
        double a = inp.nextInt();
        double b = inp.nextInt();
        double c = inp.nextInt();

        checkTriplet(a,b,c);
    }
    static void checkTriplet(double a, double b, double c){
        if (Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)){
            System.out.println("triplet found");
        } else if (Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2)) {
            System.out.println("triplet found");
        } else if (Math.pow(c,2)==Math.pow(b,2)+Math.pow(a,2)) {
            System.out.println("triplet found");
        }else {
            System.out.println("not a triplet");
        }
    }
}