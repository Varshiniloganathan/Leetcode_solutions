class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxcandies = 0;
        for(int i=0;i<candies.length;i++){
              maxcandies = Math.max(maxcandies,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            int curtot = candies[i] + extraCandies;
            if(curtot >= maxcandies){
                   ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}