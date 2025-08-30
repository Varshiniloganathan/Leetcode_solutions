class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> smap = new HashMap<>();
        for(char l:s.toCharArray()){
            smap.put(l,smap.getOrDefault(l,0)+1);
        }
        Map<Character,Integer> tmap = new HashMap<>();
        for(char l:t.toCharArray()){
            tmap.put(l,tmap.getOrDefault(l,0)+1);
        }
        for(int i=0;i<t.length();i++){
            if((!smap.containsKey(t.charAt(i)))|| (smap.get(t.charAt(i))<=0)) return t.charAt(i);
            smap.put(t.charAt(i),smap.get(t.charAt(i))-1);
        }
        return t.charAt(0);
        
    }
}