class Solution {
    public int reverse(int num){
        int rev = 0;
        while(num!=0){
            int ld = num%10;
            rev = (rev*10)+ld;
            num/=10;

        }
        return rev;

    }
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int r1 = reverse(num);
        int r2 = reverse(r1);
        return r2 == temp;
        
    }
}