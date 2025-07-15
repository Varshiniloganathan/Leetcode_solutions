class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int start = 0;
        int end = n-1;
        String vowels = "AEIOUaeiou";
        while(start<end){
            while(start<end && vowels.indexOf(chars[start])==-1){
                start++;
            }
            while(start<end && vowels.indexOf(chars[end])==-1){
                end--;
            }
            if(start< end){
                char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
            }
            
        }
        return new String(chars);
    }
}
