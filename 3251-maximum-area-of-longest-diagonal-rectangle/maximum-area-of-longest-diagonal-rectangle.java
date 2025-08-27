class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int longDiagon = 0;
        int area = 0;
        for(int[] i:dimensions){
            int len = i[0]*i[0] + i[1]*i[1];
            if(len>longDiagon ){
                longDiagon = len;
                area = i[0]*i[1];
                
            }
            else if(len == longDiagon && i[0]*i[1]>area){
                longDiagon = len;
                area = i[0]*i[1];
            }
        }
        return area;
        
    }
}