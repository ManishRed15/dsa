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
                    boolean isPresentInRow = rowSet[i].add(board[i][j]);
                    boolean isPresentInColumn = columnSet[j].add(board[i][j]);
                    boolean isPresentInGrid = gridSet[gridNo].add(board[i][j]);

                if(!isPresentInRow || !isPresentInColumn || !isPresentInGrid){
                    return false;
                }
                //rowSet[i].add(board[i][j]);
                //columnSet[j].add(board[i][j]);
                //gridSet[gridNo].add(board[i][j]);
            }
            }
        }
        return true;

    }
}