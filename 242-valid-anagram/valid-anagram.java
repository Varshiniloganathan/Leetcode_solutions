class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> s1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            s1.put(s.charAt(i), s1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(!s1.containsKey(t.charAt(i))){
                return false;
            }
            else if(s1.get(t.charAt(i)) <= 0){
                return false;
            }
            else{
                s1.put(t.charAt(i),s1.getOrDefault(t.charAt(i),0)-1);
            }
        }
        return true;
        
    }
}