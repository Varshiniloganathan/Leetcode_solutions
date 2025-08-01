class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> sub = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    sub.add(1);
                }
                else{
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    sub.add(val);
                }
            }
            ans.add(sub);
        }
        return ans;
        
        
    }
}