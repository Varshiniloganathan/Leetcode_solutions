class Solution {
    public String minWindow(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int r = 0;
        int l = 0;
        int minlen = Integer.MAX_VALUE;
        int startind = -1;
        int cnt = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<tlen;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<slen){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>0){
                cnt++;
            }
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
            while(cnt == tlen ){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                    startind = l;
                }
                map.put(s.charAt(l),map.get(s.charAt(l))+1);
                if(map.get(s.charAt(l))>0) cnt--;
                l++;
            }
            r++;

        }
        return startind>=0?s.substring(startind,startind+minlen):"";
        
    }
}