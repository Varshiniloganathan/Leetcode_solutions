class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> freq = new HashMap<>();
        for(int i=0;i<words.length;i++){
            freq.put(words[i],freq.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> heap = new PriorityQueue<>(
            (a,b)->{
                int freqcomp = freq.get(b) - freq.get(a);
                if(freqcomp == 0) return a.compareTo(b);
                return freqcomp;

            }
            
        );
        heap.addAll(freq.keySet());
        List<String> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(heap.poll());

        }
        
        return res;
        
    }
}