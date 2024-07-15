public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };
        int[][] ans = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j--) {
                ans[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
