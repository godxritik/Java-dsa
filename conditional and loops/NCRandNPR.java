
import java.util.Scanner;

public class NCRandNPR{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = inp.nextInt();
        System.out.println("enter the value of r");
        int r = inp.nextInt();


        // taking inputs
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMinusR = n-r;
        int nMinusRfact = factorial(nMinusR);

        System.out.println("choose what to calculate : 1 for nCr and 2 for nPr 0 for exit");
        int choice = inp.nextInt();
        switch(choice){
            case 1-> {
                    double result = calculateNCR(nFact, rFact, nMinusRfact);
                    System.out.println("the nCr is : " + result);
                    break;
            } 
            case 2 ->{
                double result = calculateNPR(nFact, nMinusRfact);
                System.out.println("the nPr is : " + result);
                break;                
            }
            case 0 -> {
                System.out.println("--program terminate--");
                break;
                }
            default -> System.out.println("invalid input program exit : ");

        }

        // formula = nCr = n!/r!*(n-r)!
    }

    static double  calculateNPR(int nFact, int nMinusRfact){
        double res = nFact/nMinusRfact;
        return res;
    }


    static double  calculateNCR(int nFact,int rFact, int nMinusRfact){
        int denominator = rFact*nMinusRfact;
        double res = nFact/denominator;
        return res;
    }

    static int factorial(int num){
        int fact = 1;
        for(int i=num; i>=1;i--){
            fact = fact*i;
        }
        return fact;
    }



}