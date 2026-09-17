class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(flowerbed.length==1 && flowerbed[0]==0){
            n--;
        }
       for(int i=0;i<flowerbed.length;i++){
        if(i==0 && n>0 && flowerbed[i]!=1 && flowerbed[i+1]!=1){
            flowerbed[i] = 1;
            n--;
        }
        else if(i!=0 && i<flowerbed.length-1 && n>0 && flowerbed[i]!=1 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
            flowerbed[i] = 1;
            n--;
        }
        else if(i==flowerbed.length-1 && n>0 &&flowerbed[i]!=1 && flowerbed[i-1]!=1){
            flowerbed[i] = 1;
            n--;
        }
       }
       if(n==0) return true;
       return false;
    }
}