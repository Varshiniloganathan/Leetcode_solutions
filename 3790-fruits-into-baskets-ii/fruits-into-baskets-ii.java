class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int cnt = n;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(fruits[i]<=baskets[j]){
                    cnt--;
                    baskets[j]=-1;
                    break;
                }
            }
        }
        return cnt;
        
    }
}