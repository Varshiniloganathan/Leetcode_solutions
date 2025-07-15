class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int n = words.length;
        for(int i=0;i<n;i++){
            char[] let = words[i].toCharArray();
            int start=0;
            int end = let.length-1;
            while(start<=end){
                char temp = let[start];
                let[start] = let[end];
                let[end] = temp;
                start++;
                end--;
            }
            words[i] = new String(let);
           
        }
        return String.join(" ",words);
    }
}