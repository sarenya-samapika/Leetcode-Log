public class leetcode_258_add_digits {
    public int addDigits(int num) {
        int arr[] = new int[100];
        while (num >= 10){
            int count = 0;
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                arr[count] = rem;
                num = num / 10;
                count ++;
            }
            for(int i = 0; i < count; i++){
                sum += arr[i];
            }
            num = sum;
        }
        return num;
    }
}
