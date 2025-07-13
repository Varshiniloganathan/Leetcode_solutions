class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;
        while(n>2){
            int ans = t1+t2+t3;
            t1 = t2;
            t2 = t3;
            t3 = ans;
            n--;
        }
        return t3;
    }
}