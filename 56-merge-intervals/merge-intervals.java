class A implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new A());

        ArrayList<int[]> list = new ArrayList<>();
        int[] start = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] end = intervals[i];
            if(start[1] >= end[0]){
                start[1] = Math.max(start[1],end[1]);
            }
            else{
                list.add(start);
                start = end;
            }

        }
        list.add(start);
        return list.toArray(new int[list.size()][]);

    }

}
