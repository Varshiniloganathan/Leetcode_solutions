class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int i = 0,j = 0, m1 = 0, m2 = 0;

        for(int cnt = 0; cnt<=(m+n)/2 ; cnt++){
            m2 = m1;
            if(i!=n && j!=m){
                if(nums1[i] > nums2[j]){
                    m1 = nums2[j++];
                }
                else{
                    m1 = nums1[i++];
                }
            }
            else if(i>=n){
                m1 = nums2[j++];
            }
            else{
                m1 = nums1[i++];
            }
        }
        if((n+m)%2 == 0){
            double ans = (m1+m2)/2.0;
            return ans;
        }

        return m1;

        
    }
}