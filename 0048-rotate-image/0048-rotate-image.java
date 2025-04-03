class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;

        for(int i=0; i<m ;i++){
            for(int j=i; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int row=0; row<m; row++){
            int left = 0, right = m-1;
            while(left < right){
                int temp = matrix[row][right];
                matrix[row][right] = matrix[row][left];
                matrix[row][left] = temp;
                left++;
                right--;
            }
        }
        
    }
}