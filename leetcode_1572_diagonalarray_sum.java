public class leetcode_1572_diagonalarray_sum {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i< mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i == j){
                    sum1 += mat[i][j];
                }
                else if (i + j == mat.length -1){
                    sum2 += mat[i][j];
                }
            }
        }
        if(mat.length %2 !=0){
            int mid = mat.length / 2;

        }
        return sum1 + sum2;
    }
}
