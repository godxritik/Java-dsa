public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {101,98,95,93,87,86,34,32,23,10,6};
        int target = 95;

        int index = anyOrderBS(arr,target);
        System.out.println(index);

    }

    static int anyOrderBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isASC = arr[start]<arr[end];

        if (isASC){
            while (start<end){
                int mid = start + (end-start)/2;

                if (target == arr[mid]){
                    return mid;
                }
                else if (target < arr[mid]) {
                    end = mid-1;
                }
                else if (target > arr[mid]) {
                    start=mid+1;
                }

            }
        } else {
            while (start<end){
                int mid = start + (end-start)/2;

                if (target == arr[mid]){
                    return mid;
                }
                else if (target > arr[mid]) {
                    end = mid-1;
                }
                else if (target < arr[mid]) {
                    start=mid+1;
                }

            }
        }


         return-1;
    }



}
