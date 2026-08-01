public class leetcode_1470_shuufle_the_array {
    public int[] shuffle(int[] nums, int n) {
        int[] xArr = new int[n];
        int[] yArr = new int[n];
        for(int i = 0 ; i < n; i++){
            xArr[i] = nums[i];
        }
        for(int j = 0 ; j < n ; j++){
            yArr[j] = nums[j + n];
        }
        int[] ans = new int[2*n];
        for(int k = 0; k<n; k++){
            ans[2*k] = xArr[k] ;
            ans[2*k + 1] = yArr[k];
        }
        return ans;
    }
}
