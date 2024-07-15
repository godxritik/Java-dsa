public class linear {
    public static void main(String[] args) {
        int[] arr = {1,45,36,73,21,78,32,57,88,121,3,4,8};
        int target = 73;
        int count=1;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==target){
                count=0;
                System.out.println("element found at : " + i);
            }
        }
        if (count==1){
            System.out.println("element not found");
        }

    }
}
