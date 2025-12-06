class MyHashSet {
    List<Integer> set;
    public MyHashSet() {
        set = new ArrayList<>();
    }
    
    public void add(int key) {
        set.add(key);
        return;
        
    }
    
    public void remove(int key) {
       for(int i=set.size()-1;i>=0;i--){
        if(set.get(i)==key){
            set.remove(i);
        }
       }
        

    }
    
    public boolean contains(int key) {
        return set.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */