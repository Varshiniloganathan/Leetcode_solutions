class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int key = i+j;
                if(!map.containsKey(key)){
                    map.put(i+j,new ArrayList<>());
                }

                map.get(key).add(mat[i][j]);

            }
        }

        for(Map.Entry<Integer,List<Integer>> e:map.entrySet()){
            if(e.getKey()%2==0){
                Collections.reverse(e.getValue());
            }
        }
        int[] ans = new int[mat.length * mat[0].length];
        int idx=0;
        for(List<Integer> l:map.values()){
            for(int val:l){
                ans[idx++]=val;
            }
        }

         
        return ans;
    }
}