class Solution {
    public int minDeletion(String s, int k) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        int d = freq.size()-k;
        if(d<=0) return 0;
        List<Integer> count = new ArrayList<>(freq.values());
        Collections.sort(count);
        int ans=0;
        for(int i=0;i<d;i++){
            ans+=count.get(i);

        }
        return ans;
        
    }
}