class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int max = Collections.max(freq.values());
        int cnt=0;
        for(int i:freq.values()){
            if(i==max) cnt+=i;
            
        }
        return cnt;
        
    }
}