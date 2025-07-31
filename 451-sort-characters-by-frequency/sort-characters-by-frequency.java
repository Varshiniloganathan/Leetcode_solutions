class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)->{
            int freqCompare = map.get(b) - map.get(a); 
                if (freqCompare == 0) {
                    return a - b; 
                }
                return freqCompare;
        });
        for(int i=0;i<n;i++){
            maxheap.add(s.charAt(i));
        }
        while(!maxheap.isEmpty()){
            sb.append(maxheap.poll());
        }
        return sb.toString();
        
    }
}