class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //if(ransomNote.length()<magazine.length()) return false;
        Map<Character,Integer> rmap = new HashMap<>();
        for(char l:ransomNote.toCharArray()){
            rmap.put(l,rmap.getOrDefault(l,0)+1);

        }
        Map<Character,Integer> mmap = new HashMap<>();
        for(char l:magazine.toCharArray()){
            mmap.put(l,mmap.getOrDefault(l,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if((!mmap.containsKey(ransomNote.charAt(i)))|| (mmap.get(ransomNote.charAt(i))<=0)) return false;
            mmap.put(ransomNote.charAt(i),mmap.get(ransomNote.charAt(i))-1);
            
        }
        return true;
        /*for(Map.Entry<Character,Integer> entry:rmap.entrySet()){
            Character rchar = entry.getKey();
            if(!mmap.containsKey(rchar)){
                return false;
            }
            Integer mval = mmap.get(rchar);
            if(mval<=0) return false;
            mmap.put(rchar,mmap.get(rchar)-1);
        }
        return true;*/

        
    }
}