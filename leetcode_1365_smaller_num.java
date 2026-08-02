public class leetcode_1365_smaller_num {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;

            for(int j = 0; j< nums.length; j++){
                int min = nums[i];
                if (nums[j] < min){
                    count ++;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}
