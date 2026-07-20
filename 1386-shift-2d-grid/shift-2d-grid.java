class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;

        
        while(k!=0){
            int frst = grid[r-1][c-1];
           for(int i=r-1;i>=0;i--){
             for(int j=c-1;j>=0;j--){
                if(j==0 && i!=0){
                    grid[i][j] = grid[i-1][c-1];
                }
                else if(i!=0 || j!=0){
                    grid[i][j] = grid[i][j-1];

                }
                else{
                    grid[0][0] = frst;
                }
                
                
            }
            

        }
        k--;


        }
        List<List<Integer>> nestedList = Arrays.stream(grid)
            .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
            .collect(Collectors.toList());
        
    return nestedList;
        
    }
}