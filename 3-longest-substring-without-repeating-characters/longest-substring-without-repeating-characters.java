class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxlen = 0;
        if(n<=1) return n;
        while(r<n){
            
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l,map.get(s.charAt(r))+1);
                
            }
            int len = r-l+1;
            if(len>maxlen){
                maxlen = len;
            }
            map.put(s.charAt(r),r);
            r++;

        }
        return maxlen;
    }
}