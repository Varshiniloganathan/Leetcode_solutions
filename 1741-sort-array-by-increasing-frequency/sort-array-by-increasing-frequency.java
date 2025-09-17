class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> fmap = new HashMap<>();
        for(int num:nums){
            fmap.put(num,fmap.getOrDefault(num,0)+1);
        }
        Map<Integer,TreeSet<Integer>> tmap = new TreeMap<>();
        for(int j:fmap.keySet()){
            int val = fmap.get(j);
            if(tmap.containsKey(val)){
                
                tmap.get(val).add(j);
            }
            else{
                tmap.put(val,new TreeSet<Integer>(Comparator.reverseOrder()));
                tmap.get(val).add(j);
            }
            

        }
        int[] ans = new int[nums.length];
        int ind=0;
        for(int i:tmap.keySet()){
            TreeSet<Integer> ts = new TreeSet<>(tmap.get(i));
            for(int n:ts){
                for(int k=0;k<i;k++){
                    ans[ind++]=n;
                }
            }
        }
        return ans;
    }
}