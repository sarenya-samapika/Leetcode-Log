public class leetcode_1920_buildarray {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
