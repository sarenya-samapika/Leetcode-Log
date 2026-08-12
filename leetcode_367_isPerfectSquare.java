public class leetcode_367_isPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (end >= start){
            int mid = start + (end - start) / 2;
            if (mid < num/mid){
                start = mid + 1 ;
            }
            else if(mid > num/mid){
                end = mid -1 ;
            }
            else{
                if(mid * mid == num){
                    return true;
                }
            }
        }
        return false;
    }
}
