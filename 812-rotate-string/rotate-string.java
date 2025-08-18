class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        int n = goal.length();
        int i=0;
        while(i<n){
            char last = goal.charAt(n-1);
            goal = last+goal.substring(0,n-1);
            if(s.equals(goal)) return true;
            i++;
        }
        return false;
        
    }
}