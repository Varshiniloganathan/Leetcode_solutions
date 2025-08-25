class Solution {
    public List<Integer>  minop(List<Integer> arr,int i){
        int minsum = arr.get(i)+arr.get(i+1);
        int minind = 0;
        for(int ind=1;ind<arr.size()-1;ind++){
            int sum = arr.get(ind)+arr.get(ind+1);
            if(sum<minsum){
                minsum = sum;
                minind = ind;
            }
        }
        arr.set(minind,minsum);
        arr.remove(minind+1);
        return arr;


    }
    public boolean sorted(List<Integer> arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int num:nums){
            arr.add(num);
        }
        int op=0;
        while(!sorted(arr)){
            op++;
            minop(arr,0);
        }
        
        return op;
        
    }
}