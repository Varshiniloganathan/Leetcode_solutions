class Solution {
    public String convert(String s, int numRows) {
        char[][] mat = new char[numRows][s.length()];
        for(char[] arr : mat){
            Arrays.fill(arr,' ');
        }
        int idx = 0;
        int col = 0;
        while(idx < s.length()){
            int r = 0;
            while(idx<s.length() && r<numRows){
                mat[r++][col] = s.charAt(idx++);
            }
            r = numRows-2;
            while(idx<s.length() && r>0){
                mat[r--][++col] = s.charAt(idx++);
            }
            col++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<numRows; i++){
            for(int j=0;j<s.length();j++){
                if(mat[i][j]!=' '){
                    ans.append(mat[i][j]);
                }
            }
        }

        return ans.toString();

        
    }
}