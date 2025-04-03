class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int direction = 0;
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        List<Integer> res = new ArrayList<>();

        while(top <= bottom && left<=right){
            if(direction == 0){ //print top left to right
                for(int j=left; j<=right; j++){
                    res.add(matrix[top][j]);
                }
                top++;
                direction = 1;
            }
            else if(direction == 1){//print rightmost top to bottom
                for(int i=top; i<=bottom; i++){
                    res.add(matrix[i][right]);
                }
                right--;
                direction = 2;
            }
            else if(direction == 2){ //print bottom right to left
                for(int j=right; j>=left; j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;
                direction = 3;
            }
            else{ //print bottom to top in the left
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }
        return res;
    }
}