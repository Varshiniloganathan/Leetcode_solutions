class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         List<Integer> ansList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]!=nums2[j]&& nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]!=nums2[j]&& nums2[j]<nums1[i]){
                j++;
            }
            else if(nums1[i]==nums2[j]){
                ansList.add(nums1[i]);
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        int[] ans = new int[ansList.size()];
        for(int k=0;k<ansList.size();k++){
            ans[k]=ansList.get(k);
        }
        return ans;
        
    }
}