class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        int ele1 = 0, ele2 = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1++;
                ele1 = nums[i]; 
            }
            else if(cnt2 == 0 && nums[i]!=ele1){
                cnt2++;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        int newcnt1 = 0, newcnt2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == ele1) newcnt1++;
            else if(nums[i] == ele2) newcnt2++;
        }
        if(newcnt1> nums.length/3) ans.add(ele1);
        if(newcnt2 > nums.length/3) ans.add(ele2);
        return ans;
        
    }
}