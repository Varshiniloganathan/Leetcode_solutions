class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i = 0;
        int maxLen = 0; 
        Map<Character,Integer> map = new HashMap<>();

        for(int j=0;j<s.length();j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

            while(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) > 1){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }

            if(j-i+1 > maxLen){
                maxLen = j-i+1;
            }
        }
        return maxLen;
        
    }
}