import java.util.Scanner;
import java.util.Stack;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("enter the three numbers : ");
        for (int i =0; i<3;i++){
            nums[i] = inp.nextInt();
        }

        int minimum = Min(nums);
        System.out.println("minimum is : " + minimum);

        int maximum = Max(nums);
        System.out.println("maximum is : " + maximum);
    }

    static int Min(int[] nums){
        int min = nums[0];
        for (int i =1; i<3; i++){
            if (nums[i]<=min){
                min = nums[i];
            }
        }
        return min;
    }
    static int Max(int[] nums){
        int max = nums[0];

        for (int i =1; i<3; i++){
            if (nums[i]>=max){
                max = nums[i];
            }
        }
        return max;
    }
}
