class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> a[0]==b[0]?Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));

        int[] newInterval = new int[]{intervals[0][0],intervals[0][1]};

        int count =0;
        for(int i=1; i<intervals.length; i++){
            if(newInterval[1]>intervals[i][0]){
                count++;
                newInterval[1] = Math.min(newInterval[1],intervals[i][1]);
            }
            else{
                newInterval = intervals[i];
            }
        }
        return count;
    }
}