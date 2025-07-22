class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        /*Set<Character> set = new HashSet<>();
        int maxlen = 0;
       for(int right=0;right<n;right++){
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        maxlen = Math.max(maxlen,right-left+1);
       }
       return maxlen;*/
       Map<Character,Integer> count = new HashMap<>();
       int maxlen = 0;
       for(int right =0;right<n;right++){
         char c = s.charAt(right);
         count.put(c,count.getOrDefault(c,0)+1);
         while(count.get(c)>1){
            char leftchar = s.charAt(left);
            count.put(leftchar,count.get(leftchar)-1);
            left++;
         }
         maxlen = Math.max(maxlen,right-left+1);
       }
       return maxlen;
    }
}