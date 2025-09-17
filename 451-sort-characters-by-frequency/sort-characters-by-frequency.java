class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> fmap = new HashMap<>();
        for(char c:s.toCharArray()){
            fmap.put(c,fmap.getOrDefault(c,0)+1);
        }
        Map<Integer,ArrayList<Character>> map = new TreeMap<>(Collections.reverseOrder());
        for(char c:fmap.keySet()){
            int val = fmap.get(c);
            if(map.containsKey(val)){
                map.get(val).add(c);
            }
            else{
                map.put(val,new ArrayList<>());
                map.get(val).add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i:map.keySet()){
            ArrayList<Character> list = new ArrayList<>(map.get(i));
            for(char let:list){
                for(int k=0;k<i;k++){
                    sb.append(let);
                }
            }
        }
        return sb.toString();

    }
}