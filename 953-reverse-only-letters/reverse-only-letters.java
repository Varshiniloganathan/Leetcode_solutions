class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int low = 0;
        int high = n-1;
        while(low<high){
            if((Character.isLetter(chars[low]))&& (Character.isLetter(chars[high]))){
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
                low++;
                high--;
            }
            else if(!Character.isLetter(chars[low])){
                low++;
            }
            else{
                high--;
            }
        }
        return new String(chars);
        
    }
}