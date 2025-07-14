class Solution {
    public static boolean digit(int i){
        int temp = i;
        while(i!=0){
            int ld = i%10;
            if(ld==0 || temp%ld !=0){
                return false;
            }
            i/=10;

        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> fin = new ArrayList<>();
        for(int i = left;i<=right;i++){
            boolean ans = digit(i);
            if(ans){
                fin.add(i);
            }
        }
        return fin;
    }
}