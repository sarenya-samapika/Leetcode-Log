/*
 * Problem: LeetCode 1929 - Concatenation of Array
 * Difficulty: Easy
 * Time Complexity: O(n) - Single pass traversal through the array of size n
 * Space Complexity: O(n) - Allocated a new result array of size 2n
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // Copy to first half
            ans[i + n] = nums[i];   // Copy to second half
        }
        
        return ans;
    }
}