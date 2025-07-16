class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && n==1) return flowerbed[0]==0;
            
        int i=0;
        while(n>0 && i<flowerbed.length){
               if(i==0 && flowerbed[i]!=1  && flowerbed[i+1]!=1){
                   flowerbed[i] = 1;
                    n--;
                    
               }
               else if(i==flowerbed.length-1 && flowerbed[i-1]!=1 && flowerbed[i]!=1){
                    n--;
               }
               else if(i!=0 && i!=flowerbed.length-1&&flowerbed[i]!=1 && flowerbed[i-1]!=1 && flowerbed[i+1] !=1){
                    flowerbed[i]=1;
                    n--;
                    
               }
               i++;
                
        }
        return n==0;
        
    }
}