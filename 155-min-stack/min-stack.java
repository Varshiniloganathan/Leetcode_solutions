class MinStack {
    List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();

    }

    public void push(int value) {                           
        
        if(st.isEmpty()){
            st.add(new int[]{value,value});
        }
        else{
            int[] top = st.get(st.size()-1);
             if(top[1] >= value){
            st.add(new int[]{value,value});
        }
        else{
            st.add(new int[]{value,top[1]});
        }
        }
       
        
    }

    public void pop() {

        st.remove(st.size()-1);

    }

    public int top() {
        return st.get(st.size()-1)[0];

    }

    public int getMin() {
        return st.get(st.size()-1)[1];

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */