class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int top=0, right= n-1, left = 0, bottom = m-1;
        int direction = 0;

        while(top <= bottom && left <= right){
            if(direction == 0){
                //print left to right(top)
                for(int j=left; j<=right; j++){
                    res.add(matrix[top][j]);
                }
                direction = 1;
                top++;
            }
            else if(direction == 1){
                //print top to bottom(right)
                for(int i=top; i<=bottom; i++){
                    res.add(matrix[i][right]);
                }
                direction = 2;
                right--;
            }
            else if(direction == 2){
                //print right to left(bottom)
                for(int j=right; j>=left; j--){
                    res.add(matrix[bottom][j]);
                }
                direction = 3;
                bottom--;
            }
            else{
                //print bottom to top(left)
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