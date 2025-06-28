class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        if(arr1.length<arr.length) return false;
        if(arr.length==0 || (arr.length==0 && arr1.length==0)) return true;
        int i=0;
        int j =0;
        while(i<arr.length){
            if(arr[i]==arr1[j]){
                i++;
                if(j<arr1.length-1){
                    j++;
                }
                else if(i<arr.length-1 && j==arr1.length-1){
                    return false;
                }
            }
            else if(arr[i]!=arr1[j] && j<arr1.length-1){
                j++;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}