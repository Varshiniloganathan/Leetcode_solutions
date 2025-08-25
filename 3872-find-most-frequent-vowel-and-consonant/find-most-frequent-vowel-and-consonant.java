class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel = new HashMap<>();
        Map<Character,Integer> consonant =  new HashMap<>();
        for(char c:s.toCharArray()){
            if(c == 'a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                vowel.put(c,vowel.getOrDefault(c,0)+1);
            }
            else{
                consonant.put(c,consonant.getOrDefault(c,0)+1);
            }
        }
        int vcnt=0;
        for(Map.Entry<Character,Integer> e:vowel.entrySet()){
            if(e.getValue()>vcnt){
                vcnt=e.getValue();
            }
            
        }
        int ccnt=0;
        for(Map.Entry<Character,Integer> e:consonant.entrySet()){
            if(e.getValue()>ccnt){
                ccnt=e.getValue();
            }
        }
        return vcnt+ccnt;
        
        
    }
}