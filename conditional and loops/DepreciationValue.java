
import java.util.Scanner;

public class DepreciationValue{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the Asser value , salvage cost and useful life in years");
        int assetValue = inp.nextInt();
        int salvageCost = inp.nextInt();
        float usefulLife = inp.nextFloat();

        double result = depreciation(assetValue,salvageCost,usefulLife);
        System.out.printf("the depreciation amount is : %.2f" , result);
    }

    static double depreciation(int assetValue, int salvageCost, float usefulLife){
        double depreciationCost = (assetValue - salvageCost)/usefulLife;
        return depreciationCost;
    }
}