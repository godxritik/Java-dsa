public class findCeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int target = 23;

        int index = findCeil(arr,target);
        System.out.println(arr[index]);

    }

    static int findCeil(int[]arr, int target){
        int start =0;
        int end = arr.length-1;

        boolean isASC = arr[start]<arr[end];
        if (isASC){
            while(start <= end){
                int mid = start + (end-start)/2;
                if (target == arr[mid]){
                    return mid;
                }
                else if (target < arr[mid]){
                    end = mid-1;
                } else if (target > arr[mid]) {
                    start = mid+1;
                }
            }
        }else {
            while(start <= end){
                int mid = start + (end-start)/2;
                if (target == arr[mid]){
                    return mid;
                }
                else if (target > arr[mid]){
                    end = mid-1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }
            }

        }
            return start;
    }

}
