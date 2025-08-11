class Solution {
    public boolean isPalindrome(int left,int right,String s){
        while(left<=right){
            if(s.charAt(left++)!=s.charAt(right--)){
            return false;
           }
        }
        
        return true;
    }
    public void func(int ind,String s,List<String> ds,List<List<String>> ans){
        if(ind == s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(ind,i,s)){
                ds.add(s.substring(ind,i+1));
                func(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> ds = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        func(0,s,ds,ans);
        return ans;

        
    }
}