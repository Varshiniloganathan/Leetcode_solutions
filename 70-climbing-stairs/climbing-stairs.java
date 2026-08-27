class Solution {

    public int recur(int n, Map<Integer, Integer> hmap) {
        if (hmap.containsKey(n))
            return hmap.get(n);
        if (n == 1 || n == 2)
            return n;
        int res = recur(n - 1,hmap) + recur(n - 2,hmap);
        hmap.put(n, res);
        return hmap.get(n);

    }

    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        return recur(n,map);

    }
}