class Solution {
    public int numberOfSubstrings(String s) {
        /*int n = s.length();
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
        return cnt;*/
        int[] arr = new int[3];
        Arrays.fill(arr,-1);
        int cnt=0;
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'a'] = r;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                int min = Math.min(arr[0],Math.min(arr[1],arr[2]));
                cnt = cnt + min + 1;

            }

        }
        return cnt;
    }
}