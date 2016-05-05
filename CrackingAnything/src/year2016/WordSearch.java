package year2016;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		if(board == null || board.length == 0 || board[0].length == 0){
			return false;
		}
		
		if(word == ""){
			return true;
		}
		
		
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)){
					return true;
				}
			}
		}
		return false;
    }
	
	private boolean dfs(char[][] board, int x, int y, int index, String word){
		if(x >= board.length || x < 0 || y >= board[0].length || y < 0){
			return false;
		}
		
		char temp = board[x][y];
		
		if(temp != word.charAt(index))
			return false;
		if(temp == word.charAt(index) && index == word.length() - 1)
			return true;
		else if(temp == word.charAt(index)){
			board[x][y] = '*';
		}
		
		if(dfs(board, x+1, y, index+1, word) || dfs(board, x-1, y, index+1, word)
				|| dfs(board, x, y+1, index+1, word) || dfs(board, x, y-1, index+1, word))
			return true;
		else{
			board[x][y] = temp;
			return false;
		}
	}
}
