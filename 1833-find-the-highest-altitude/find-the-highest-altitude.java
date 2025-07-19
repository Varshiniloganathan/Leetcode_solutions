class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] prefixsum = new int[n+1];
        prefixsum[0] = 0;
        int max = 0;
        int j = 0;
        for(int i=1;i<n+1;i++){
             prefixsum[i] = prefixsum[i-1]+gain[j];
             j++;
             if(prefixsum[i]>max){
                max = prefixsum[i];
             }
        }
        return max;
    }
}