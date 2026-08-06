public class leetcode_1732_m {
    public int largestAltitude(int[] gain) {
        int[] ansArray = new int[gain.length + 1];
        ansArray[0] = 0;
        int sum = 0;
        for (int i = 0; i<gain.length; i++){
            sum += gain[i];
            ansArray[i + 1] = sum;
        }

        int max = ansArray[0];
        for (int j = 0; j<ansArray.length; j++){
            if (ansArray[j]>max){
                max = ansArray[j];
            }
        }
        return max;
    }
}
