class Solution {
    public int recur(List<List<Integer>> tri, int i, int j, HashMap<String,Integer> dp) {
        if (i == tri.size() )
            return 0;
        if(j<0 || j>=tri.get(i).size()){
            return Integer.MAX_VALUE;
        }
        String key = i + " " + j;
        if (dp.containsKey(key))
            return dp.get(key);
        

        int val = Math.min(tri.get(i).get(j) + recur(tri, i + 1, j, dp),
                tri.get(i).get(j) + recur(tri, i + 1, j + 1, dp));
        dp.put(key,val);

        return val;

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int r = triangle.size();
        HashMap<String,Integer> dp = new HashMap<>();
        // for (int i = 0; i < r; i++) {
        //     Arrays.fill(dp[i],-1);
        // }
        return recur(triangle, 0, 0, dp);

    }
}