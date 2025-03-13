class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i=0; i<4; i++){
            if(areMatricesEql(mat, target)){
                return true;
            }
            rotateMatrix(mat);
        }

        return false;
    }

    private void rotateMatrix(int[][] mat){
        int n = mat.length;
         for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int row=0; row<n; row++){
            int left=0, right=n-1;
            while(left < right){
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                left++;
                right--;
            }
        }
    }

    private boolean areMatricesEql(int[][] mat,int[][] target){
        int n = mat.length;
        for(int i=0; i<n ;i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

}