class Solution {
    public int opr(int n){
        int prod=1;
        int sum=0;
        while(n!=0){
            int ld = n%10;
            prod*=ld;
            sum+=ld;
            n/=10;

        }
        return prod-sum;

    }
    public int subtractProductAndSum(int n) {
        return opr(n);
        
    }
}