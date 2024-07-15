public class flipArray {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] arr = new int[image.length][image.length];

        //printing original array
        System.out.println("original array : ");
        for(int row=0; row<image.length; row++){
            for (int col =0; col<image[row].length; col++){
                System.out.print(image[row][col]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        //flipping array
        for (int row=0; row< image.length; row++){
            int x=0;
            for (int col=image[row].length-1; col>=0; col--){
                arr[row][x] = image[row][col];
                x++;
            }
        }

        //printing new flipped arrray
        System.out.println("flipped array : ");
        for(int row=0; row<arr.length; row++){
            for (int col =0; col<arr[row].length; col++){
                System.out.print(arr[row][col]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        //invert array
        for(int row=0; row<arr.length; row++){
            for (int col =0; col<arr[row].length; col++) {
                if (arr[row][col] == 0)
                    arr[row][col] = 1;
                else arr[row][col] = 0;

            }
        }

        //printing inverted array
        System.out.println("flipped and inverted array : ");
        for(int row=0; row<arr.length; row++){
            for (int col =0; col<arr[row].length; col++){
                System.out.print(arr[row][col]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }



    }
}
