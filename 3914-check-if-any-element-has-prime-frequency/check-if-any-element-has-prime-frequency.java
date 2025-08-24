class Solution {
    public boolean isPrime(int num){
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) cnt++;
        }
        return cnt==2;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(isPrime(e.getValue())){
                return true;
            }
        }
        return false;
    }
}