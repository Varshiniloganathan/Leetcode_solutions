class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i =0 ;
        while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        }
        int start = (i + 1) % n;;
        int end = i;
        if(start == end && nums[start] == target) return 0;
        while(start!=end){
            if(nums[start]==target){
                return start;
            }
            else if(nums[end]==target) return end;
            else{
                start=(start+1)%n;
            }
        }
        return -1;
    }
}