class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for(int num:asteroids){
            boolean collide = false;
            while(!stack.isEmpty() && stack.peek()>0 && num<0){
                int top = stack.peek();
                if(top<-num){
                    //collide = true;
                    stack.pop();
                }
                else if(top == -num){
                    collide= true;
                    stack.pop();
                    break;
                }
                else{
                    collide = true;
                    break;
                }
            }
            if(!collide){
                stack.push(num);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}