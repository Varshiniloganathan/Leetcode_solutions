class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> stack = new Stack<>();
        for(char let : num.toCharArray()){
            while(!stack.isEmpty() && stack.peek()>let && k>0){
                stack.pop();
                k--;
            }
            stack.push(let);
        }
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()>0?sb.toString():"0";
    }
}