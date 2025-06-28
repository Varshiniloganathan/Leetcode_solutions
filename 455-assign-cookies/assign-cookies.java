class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        /*int cnt=0;
        int n = Math.min(g.length,s.length);
        for(int i=0;i<n;i++){
            while(j<s.length){
                if(g[i]<=s[j]){
                   cnt++;
                   s[j]=-1;
                   break;
                }
                else{
                    j++;
                   
                }
                

            }
            
            
        }
        return cnt;*/
        int i=0,j=0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
        
    }
}