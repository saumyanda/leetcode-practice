class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       if (board == null || board.length != 9 || board[0].length != 9)
		return false;
        
	// check each column
	for (int i = 0; i < 9; i++) {
		HashSet<Character> colSet=new HashSet<Character>();
		for (int j = 0; j < 9; j++) {
			if (board[i][j] != '.') {
				if (colSet.contains(board[i][j])) {
					return false;
				}
				colSet.add(board[i][j]);
			}
		}
	}
 
	//check each row
	for (int j = 0; j < 9; j++) {
		HashSet<Character> rowSet=new HashSet<Character>();
		for (int i = 0; i < 9; i++) {
			if (board[i][j] != '.') {
				if (rowSet.contains(board[i][j])) {
					return false;
				}
				rowSet.add(board[i][j]);
			}
		}
	}
 
	//check each 3*3 matrix
    
	for (int block = 0; block < 9; block++) {
		HashSet<Character> boxSet=new HashSet<Character>();
		for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
			for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
				if (board[i][j] != '.') {
					if (boxSet.contains(board[i][j])) {
						return false;
					}
					boxSet.add(board[i][j]);
				}
			}
		}
	}
 
	return true;
        
    }
}
