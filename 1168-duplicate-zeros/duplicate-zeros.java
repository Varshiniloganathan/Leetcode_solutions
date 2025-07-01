class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr1 = new int[arr.length];
        int i=0;
        int j=0;
        while(j<arr1.length){
            if(arr[i]==0 && j<arr1.length-1){
                arr1[j]=0;
                arr1[++j]=0;
                j++;
                i++;
            }
            else{
                arr1[j]=arr[i];
                i++;
                j++; 
            }
        }
        for(i=0;i<arr.length;i++){
            arr[i]=arr1[i];
        }
    }
}