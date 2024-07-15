public class BinarySearch {
    public static void main(String[] args) {
        int[] arr  = {10,20,30,40,50,60,70,80};
        int target =31;

        int res = searchbinary(arr,target);
        System.out.println("element found at index : " + res);

    }

    static int searchbinary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;


        while (start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                end = mid-1;
                
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
               return mid;
            }
        }

        return -1;
    }

}
