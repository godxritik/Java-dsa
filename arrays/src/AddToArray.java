import java.util.ArrayList;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {

        int[] num = {1,2,0,0};
        int k=34;
        int arrNum = 0;

        for(int i=0; i<num.length;i++){
            arrNum = (arrNum*10) + num[i];
        }
        System.out.println(arrNum);

        int newNum = arrNum + k;
        int size = Integer.toString(newNum).length();
        System.out.println(newNum);

        List<Integer> ans = new ArrayList<>();
        for (int i= size-1; i>=0;i--){
            int r = newNum%10;
            newNum = newNum/10;
            ans.add(i,r);
        }

        System.out.println(ans);
    }
}
