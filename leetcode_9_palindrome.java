public class leetcode_9_palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int arr[] = new int[100];
        int count = 0;
        while (x > 0){
            int rem = x % 10;
            arr[count] = rem;
            x = x / 10;
            count ++;
        }
        for (int i = 0; i< count/2; i++){
            if (arr[i] != arr[count -1 -i]){
                return false;
            }
        }
        return true;
    }
}
