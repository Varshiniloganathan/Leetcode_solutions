class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Set<Integer> ans = new HashSet<>();
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int num:nums2){
            if(map.containsKey(num)){
                ans.add(num);
           
            }
        }
        int[] sol = new int[ans.size()];
        int ind = 0;
        for(int num:ans){
            sol[ind++] = num;
        }
        return sol;
    }
}