public class leetcode_1281_SubtractProductandSum {
        public int subtractProductAndSum(int n) {
            int arr[] = new int[100];
            int count = 0;
            int product = 1;
            int sum = 0;
            while(n>0){
                int reminder = n % 10;
                arr[count] = reminder;
                n = n / 10;
                count ++;
            }
            for( int i = 0; i< count; i++){
                product *= arr[i];
                sum += arr[i];
            }
            int difference = product - sum;
            return difference;
        }

}
