class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length-1;
        String ans = "aeiouAEIOU";
        while(i<=j){
            while(i<j && ans.indexOf(str[i])==-1 ){
                System.out.println(i);
                i++;
            }
             while(i<j && ans.indexOf(str[j])==-1){
                System.out.println(j);
                j--;
            }
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;

        }

        return new String(str);
        
    }
}