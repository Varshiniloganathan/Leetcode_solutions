class A implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new A());

        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        while(i < intervals.length){
            int start = intervals[i][0];
            
            int j = i;

            int end = intervals[j][1];

            // while(j<intervals.length-1 && intervals[j][0] <= intervals[j+1][0] && intervals[j][1]>= intervals[j+1][0]){
            //     end = Math.max(end,intervals[j+1][1]);
            //     j++;
            // }
            while(j<intervals.length-1 && start <= intervals[j+1][0] && intervals[j+1][0] <= end){
                end = Math.max(end,intervals[j+1][1]);
                j++;
            }

            list.add(new int[]{start,end});
            i = j+1;

        }
        int[][] ans = new int[list.size()][2];
        i = 0;
        for(int[] l : list){
            ans[i][0] = l[0];
            ans[i][1] = l[1];
            i++;
        }
        return ans;

    }

}
