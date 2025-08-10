class Solution {
    public void func(int i,String digits,Map<Character,String> phone,List<String> ans,StringBuilder sb){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }
        char d = digits.charAt(i);
        String s = phone.get(d);
        for(char l:s.toCharArray()){
            sb.append(l);
            func(i+1,digits,phone,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        Map<Character,String> phone = new HashMap<>();
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(digits==null || digits.length()==0) return ans;
        func(0,digits,phone,ans,sb);
        return ans;
        
    }
}