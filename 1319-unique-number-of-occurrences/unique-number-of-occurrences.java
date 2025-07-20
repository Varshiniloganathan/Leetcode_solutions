class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int a:map.values()){
            if(set.contains(a)) return false;
            set.add(a);
        }
        return true;
    }
}