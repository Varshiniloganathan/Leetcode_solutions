class RecentCounter {
    int cnt;

    public RecentCounter() {
        cnt=0;
        
    }
    List<Integer> ans = new ArrayList<>();
    public int ping(int t) {
        ans.add(t);
        int s=t-3000,l=t;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>=s && ans.get(ans.size()-1)<=l){
                cnt = ans.size()-i;
                break;
            }
            
        }
        return cnt;
        

        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */