class Solution {
    public int bulbSwitch(int n) {
        int i=n;
        while(i>0){
            long ans = (long)i*i;
            if(ans <=n){
                return i;
            }
            i--;
        }
        return 0;
    }
}