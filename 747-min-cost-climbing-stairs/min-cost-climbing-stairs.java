class Solution {
    public int recur(int[] cost,int i,HashMap<Integer,Integer> map){

        if(map.containsKey(i)) return map.get(i);
        if(i>=cost.length) return 0;
       
        int res =  Math.min(cost[i]+recur(cost,i+1,map),cost[i]+recur(cost,i+2,map));
        map.put(i,res);
        return map.get(i);

    }
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int c1 = recur(cost,0,map);
        int c2 = recur(cost,1,map);
        return Math.min(c1,c2);

        
    }
}