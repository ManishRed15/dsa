class Solution {
    public boolean isValidSudoku(char[][] board) { 
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] columnSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for(int i=0; i<9; i++){
            rowSet[i] = new HashSet<>();
            columnSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int gridNo = (i/3)*3 + (j/3);

                if(board[i][j] != '.'){
                    boolean isPresentRow = rowSet[i].add(board[i][j]);
                    boolean isPresentColumn = columnSet[j].add(board[i][j]);
                    boolean isPresentGrid = gridSet[gridNo].add(board[i][j]);
                
                    if(!isPresentRow || !isPresentColumn || !isPresentGrid){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}