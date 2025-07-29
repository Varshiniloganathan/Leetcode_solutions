class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int l=0;
        int r = 0;
        int cnt=0;
        Map<Character,Integer> map = new HashMap<>();
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()==3){
                cnt+=n-r;
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            r++;
        }
        return cnt;
    }
}