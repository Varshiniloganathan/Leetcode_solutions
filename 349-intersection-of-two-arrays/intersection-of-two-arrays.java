class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        Set<Integer> ans = new HashSet<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if (nums2[j]<nums1[i]){
                j++;
            }
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }

        }
        int[] sol = new int[ans.size()];
        int ind = 0;
        for(int num:ans){
            sol[ind++]=num;
        }
        return sol;
    }
}