class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int write = 0;
        while(i<chars.length){
            char curr = chars[i];
            int cnt=0;
            while(i<chars.length && curr == chars[i]){
                cnt++;
                i++;
            }
            chars[write++] = curr;
            if(cnt>1){
                for(char c:String.valueOf(cnt).toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }
}