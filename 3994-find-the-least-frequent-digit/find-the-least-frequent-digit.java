class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr = new int[10];

        while(n > 0) {
            arr[n % 10]++;
            n /= 10;
        }

        int min = arr[0], res = 0;
        
        for(int i = 1; i < 10; i++) {
            if(min==0 || arr[i] < min  && arr[i] >= 1) {
                res = i;
                min = arr[i];
            }
        }

        return res;
    }
}