class Solution {
    public int recur(int n,Map<Integer,Integer> map){
        if(n<0) return 0;
        if(n==0) return 1;
        if(map.containsKey(n)) return map.get(n);
        int ans = recur(n-1, map)+recur(n-2, map);
        map.put(n,ans);
        return ans;

    }
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return recur(n, map);

        
    }
}