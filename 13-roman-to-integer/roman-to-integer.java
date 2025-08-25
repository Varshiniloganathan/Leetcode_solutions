class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        char[] rom = s.toCharArray();
        int val = 0;
        for(int i=rom.length-1;i>=0;i--){
            if(i!=0 && ((rom[i]=='V' && rom[i-1]=='I') || (rom[i]=='X' && rom[i-1]=='I') ||(rom[i]=='L' && rom[i-1]=='X')||(rom[i]=='C' && rom[i-1]=='X')||(rom[i]=='D'&&rom[i-1]=='C')||(rom[i]=='M'&&rom[i-1]=='C'))){
                int diff = roman.get(rom[i]) - roman.get(rom[i-1]);
                val+=diff;
                i--;

            }
            else{
                val += roman.get(rom[i]);
            }
            
        }
        return val;
        
    }
}