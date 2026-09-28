class LRUCache {
    Map<Integer,Integer> map = new HashMap<>();
    List<Integer> list;
    int size;

    public LRUCache(int capacity) {
        list = new ArrayList<>(capacity);
        size = capacity;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            list.remove(Integer.valueOf(key));
            list.add(0,key);
            return map.get(key);
        }
        else{
            return -1;
        }
        
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            list.remove(Integer.valueOf(key));
            map.put(key,value);
            list.add(0,key);
        }
        else{
            if(list.size()==size){
                int rkey = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(0,key);
                map.remove(rkey);
                map.put(key,value);

            }
            else{
                map.put(key,value);
                list.add(0,key);
            }
        }

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */