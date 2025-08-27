class Solution {
    public void func(int i,String digits,Map<Character,String> map,StringBuilder sb,List<String> ans){
        if(sb.length()==digits.length()){
            ans.add(sb.toString());
            return;
        }
        char digit = digits.charAt(i);
        String comb = map.get(digit);
        for(char l:comb.toCharArray()){
            sb.append(l);
            func(i+1,digits,map,sb,ans);
            sb.deleteCharAt(sb.length()-1);

        }
    }
    public List<String> letterCombinations(String digits) {
            Map<Character,String> map = new HashMap<>();
            map.put('2',"abc");
            map.put('3',"def");
            map.put('4',"ghi");
            map.put('5',"jkl");
            map.put('6',"mno");
            map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");
            StringBuilder sb = new StringBuilder();
            List<String> ans = new ArrayList<>();
            if(digits.length()==0) return ans;
            func(0,digits,map,sb,ans);
            return ans;

    }
}