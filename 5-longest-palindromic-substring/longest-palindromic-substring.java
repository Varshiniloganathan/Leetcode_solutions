class Solution {
    public int expand(int left,int right,String s){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = 0;
        int start =0;
        for(int c = 0;c<n;c++){
            int odd = expand(c,c,s);
            int even = expand(c,c+1,s);
            int len = Math.max(odd,even);
            if(len>maxlen){
                maxlen = len;
                start = c - (len-1)/2;
            }

        }
            
        return s.substring(start,start+maxlen);
    }
}