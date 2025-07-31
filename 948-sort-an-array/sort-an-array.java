class Solution {
    public int[] merge(int[] nums,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int ind = 0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[ind++] = nums[left];
                left++;
            }
            else{
                temp[ind++]=nums[right];
                right++;
            }
            
        }
        while(left<=mid){
           temp[ind++]=nums[left];
           left++;
        }
        while(right<=high){
            temp[ind++] = nums[right];
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i] = temp[i-low];
        }
        return nums;
    }
    public int[] mergesort(int[] nums,int low,int high){
        if(low==high){
            return nums;
        }
        int mid = (low+high)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
        return nums;
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        return mergesort(nums,low,high);
    }
}