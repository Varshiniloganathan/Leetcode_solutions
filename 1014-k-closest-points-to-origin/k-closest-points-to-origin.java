class Solution {
    public int distance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b)->distance(b)-distance(a));
        for(int[] point:points){
            maxheap.add(point);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        int[][] res = new int[k][2];
        for(int i=0;i<k;i++){
            res[i] = maxheap.poll();
        }
        return res;
        
    }
}