class Solution {
    public int maxProduct(int n) {
        int len = String.valueOf(Math.abs(n)).length();
        int[] num = new int[len];
        int i=0;
        while(n!=0){
            num[i++] = n%10;
            n/=10;
        }
        Arrays.sort(num);
        return num[len-1] * num[len-2];
        
    }
}