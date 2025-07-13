class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int temp1=0;
        int temp2=1;
        while(n>1){
            int ans = temp1+temp2;
            temp1 = temp2;
            temp2=ans;
            n--;

        }
        return temp2;
         
    }
}