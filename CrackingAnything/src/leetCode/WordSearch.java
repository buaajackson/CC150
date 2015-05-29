package leetCode;

public class WordSearch {

	public boolean exist(char[][] board, String word){ 
		if(word.length() == 0)
			return false;
		if(board.length == 0 || board[0].length == 0)
			return false;
		
		boolean[] isVisited = new boolean[board.length * board[0].length];
		
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(board[i][j] == word.charAt(0)){
					isVisited[i*board[0].length + j] = true;
					
					if(search(board, word, 1, j, i, isVisited))
						return true;
					
					isVisited[i*board[0].length + j] = false;
				}
			}
		}
		return false;
	}
	
	private boolean search(char[][] board, String word, int index, int x, int y, boolean[] isVisited){
		int m = board.length;
		int n = board[0].length;
		
		if(index >= word.length())
			return true;
		
		//go up
		if(y-1 >= 0 && !isVisited[(y-1)*n + x] && board[y-1][x] == word.charAt(index)){
			
			isVisited[(y-1)*n + x] = true;
			if(search(board, word, index+1, x, y-1, isVisited))
				return true;
			
			isVisited[(y-1)*n + x] = false;
		}
		
		//go left
		if(x-1 >= 0 && !isVisited[y*n+x-1] && board[y][x-1] == word.charAt(index)){
			
			isVisited[y*n+x-1] = true;
			
			if(search(board, word, index+1, x-1, y, isVisited))
				return true;
			
			isVisited[y*n+x-1] = false;
		}
		
		//go down
		if(y+1 < m && !isVisited[(y+1)*n+x] && board[y+1][x] == word.charAt(index)){
			
			isVisited[(y+1)*n+x] = true;
			
			if(search(board, word, index+1, x, y+1, isVisited))
				return true;
			
			isVisited[(y+1)*n+x] = false;
		}
		
		//go right
		if(x+1 < n && !isVisited[y*n+x+1] && board[y][x+1] == word.charAt(index)){
			
			isVisited[y*n+x+1] = true;
			
			if(search(board, word, index+1, x+1, y, isVisited))
				return true;
			
			isVisited[y*n+x+1] = false;
		}
		return false;
	}
}
