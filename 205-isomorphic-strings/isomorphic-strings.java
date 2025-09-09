class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!smap.containsKey(s1[i])){
                smap.put(s1[i],i);
            }
            if(!tmap.containsKey(t1[i])){
                tmap.put(t1[i],i);
            }
            if(smap.get(s1[i])!=tmap.get(t1[i]) ){
                return false;
            }
        }
        
        return true;
        
    }
}