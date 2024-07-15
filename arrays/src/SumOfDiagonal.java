public class SumOfDiagonal {
    public static int main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        if (mat.length%2==0){
            int ans = diagonalSum(mat);
            return ans;
        }
        else {
            int ans = diagonalSum(mat);
            int index = mat.length-(mat.length/2)-1;
                return ans-mat[index][index];
        }

    }

    static int diagonalSum(int[][] mat){
        int n = mat.length;
        int primarySum=0;
        int secondarySum=0;

        for (int i=0; i<n;i++) {
            primarySum = primarySum + mat[i][i];
        }
        int j=mat.length-1;
        for (int i=0; i<n; i++) {
            secondarySum += mat[i][j];
            j--;
        }
        return primarySum+secondarySum;
    }

        //removing center index element







    }

