class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(int num:nums){
            if(!set.contains(num)){
                sum+=num;
            }
            set.add(num);
            
        }
        List<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        int nsum=0;
        for(int i=arr.size()-1;i>=0;i--){
            nsum+=arr.get(i);
            if(nsum>sum){
                sum=nsum;
            }

        }
        return sum;

        

    }
}