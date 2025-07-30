class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxfreq = 0;
        int l = 0;
        int r = 0;
        int maxlen = 0;
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq,freq[s.charAt(r)-'A']);
            int changes = (r-l+1) - maxfreq;
            if(changes<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            else{
                freq[s.charAt(l)-'A']--;
                l++;
            }
            r++;
        }
        return maxlen;

    }
}