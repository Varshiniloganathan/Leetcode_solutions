class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int a = st.pop();
                int b = st.pop();
                switch (tokens[i]) {
                    case "+":
                        int add = a + b;
                        st.push(add);
                        break;
                    case "-":
                        int sub = b-a;
                        st.push(sub);
                        break;
                    case "*":
                        int mult = a * b;
                        st.push(mult);
                        break;
                    case "/":
                        int div;
                        if(a == 0) {
                            div = a/b;
                        }
                        else {
                            div = b/a;
                        }
                        st.push(div);
                        break;
                }
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        // return Integer.parseInt(st.pop());
        return st.pop();

    }
}