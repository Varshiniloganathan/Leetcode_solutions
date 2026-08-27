class Solution {

    // public int recur(int n, Map<Integer,Integer> hmap){

    // }
    HashMap<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        
        if(map.containsKey(n)) return map.get(n);
        if(n==1 || n==2) return n;
        int res = climbStairs(n-1) + climbStairs(n-2);
        map.put(n,res);

        return map.get(n);

        
    }
}