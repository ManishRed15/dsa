class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        //Arrays.sort(intervals, (a,b)-> a[0]==b[0]? Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));
        Arrays.sort(intervals, (a,b)->{
            if(a[0]<b[0])
                return -1;
            else if(a[0]>b[0])
                return 1;
            else
                return a[1]-b[1];
        });

        List<int[]> res = new ArrayList<>();
        int[] current = new int[]{intervals[0][0], intervals[0][1]};

        for(int i=1; i<intervals.length; i++){
            if(current[1] >= intervals[i][0]){
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else{
                res.add(current);
                current = intervals[i];
            }
        }
        res.add(current);

        
    return res.toArray(new int[res.size()][]);
    }
}