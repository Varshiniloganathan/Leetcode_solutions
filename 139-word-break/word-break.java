class Solution {
    public boolean recur(int i,String str, String s, List<String> wordDict,Map< String,Boolean> map){
        
        if(i >= s.length()-1){
            if(str!= "" && !wordDict.contains(str)) {
                return false;
            }
            return true;
        }
        String key = i + str;
        
        // str = str+s.charAt(i);
        if(map.containsKey(key)){
            return map.get(key);
        }

        if(wordDict.contains(str)){
            
            boolean ans1 = recur(i+1,""+s.charAt(i+1),s,wordDict,map) || recur(i+1,str+s.charAt(i+1),s,wordDict,map);
            map.put(key,ans1);
            return ans1;
        }
        boolean ans2 = recur(i+1,str+s.charAt(i+1),s,wordDict,map);
        map.put(key,ans2);

        return ans2;
    }
    public boolean wordBreak(String s, List<String> wordDict) {

        HashMap<String,Boolean> map = new HashMap<>();
        return recur(0,""+s.charAt(0),s,wordDict,map);
        
    }
}