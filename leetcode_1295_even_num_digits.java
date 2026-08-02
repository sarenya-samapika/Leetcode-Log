public class leetcode_1295_even_num_digits {
    public int findNumbers(int[] nums) {
        int count2 = 0;
        for (int i =0; i < nums.length; i++){
            int count =0;
            int div = nums[i];
            while (div > 0){
                div = div / 10;
                count++;
            }
            if( count % 2 == 0){
                count2++;
            }
        }
        return count2;
    }
}
