class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int res = 1;
        int start = 1, end = position[n-1]-position[0];

        while(start <= end){
            int mid = (start+end)/2;
            if(isDistancePossible(position, m, mid)){
                res = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return res;

    }

    public boolean isDistancePossible(int[] position, int m, int dist){
        int ballCount = 1;
        int recentBallPosition = position[0];
        for(int i=1; i<position.length && ballCount < m;i++){
            if(position[i]>=recentBallPosition+dist){
                ballCount++;
                recentBallPosition = position[i];
            }
        }
        return ballCount==m;
    }
}