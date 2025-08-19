class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> sfreq = new HashMap<>();
        for(char l:s.toCharArray()){
            sfreq.put(l,sfreq.getOrDefault(l,0)+1);
        }
        Map<Character,Integer> tfreq = new HashMap<>();
        for(char l:target.toCharArray()){
            tfreq.put(l,tfreq.getOrDefault(l,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(char l:target.toCharArray()){
            if(sfreq.containsKey(l)){
                min = Math.min(min,sfreq.get(l)/tfreq.get(l));
            }
            else{
                return 0;
            }
            

        }
        return min;
        
    }
}