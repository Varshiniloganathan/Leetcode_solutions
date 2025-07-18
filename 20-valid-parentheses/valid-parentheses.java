class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(ans.isEmpty() || s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                ans.push(s.charAt(i));
            }
            else if(!ans.isEmpty() && (s.charAt(i) == ')'&& ans.peek()=='(') || (s.charAt(i)=='}' && ans.peek()=='{') || (s.charAt(i)==']' && ans.peek()=='[')){
                ans.pop();
            }
            else{
                return false;
            }
        }
        return ans.isEmpty();
    }
}