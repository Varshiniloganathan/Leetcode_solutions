class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxlen = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(r<n){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>=l){
                l = map.get(s.charAt(r))+1;
            }
            map.put(s.charAt(r),r);
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}