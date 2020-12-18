

class Jadge{

	private String black = "●";
	private String white = "〇";


	int upperSearch(int turn ,int row, int column, Board b){
		int count = 0;
		if(turn % 2 == 1){
			for(int i = row;i > 0; i--){
				if(black == b.board[i][column]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		else{
			for(int i = row; i > 0; i--){
				if(white == b.board[i][column]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		return count;
	}
	
	int rightUpperSearch(int turn ,int row, int column, Board b){
		int count = 0;
		int i = row;
		int j = column;
		if(turn % 2 == 1){
			while(i > 0 && j < 20){
				if(black == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i--;
				j++;
			}
		}
		else{
			while(i > 0 && j < 20){
				if(white == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i--;
				j++;
			}
		}
		return count;
	}
	int rightSearch(int turn ,int row, int column, Board b){
		int count = 0;
		if(turn % 2 == 1){
			for(int j = column; j < 20; j++){
				if(black == b.board[row][j]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		else{
			for(int j = column; j < 20; j++){
				if(white == b.board[row][j]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		return count;
	}
	int rightUnderSearch(int turn ,int row, int column, Board b){
		int count = 0;
		int i = row;
		int j = column;
		if(turn % 2 == 1){
			while(i < 20 && j < 20){
				if(black == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i++;
				j++;
			}
		}
		else{
			while(i < 20 && j < 20){
				if(white == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i++;
				j++;
			}
		}
		return count;
	}
	int underSearch(int turn ,int row, int column, Board b){
		int count = 0;
		if(turn % 2 == 1){
			for(int i = row;i < 20; i++){
				if(black == b.board[i][column]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		else{
			for(int i = row; i < 20; i++){
				if(white == b.board[i][column]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		return count;
	}
	int leftUnderSearch(int turn ,int row, int column, Board b){
		int count = 0;
		int i = row;
		int j = column;
		if(turn % 2 == 1){
			while(i < 20 && j > 0){
				if(black == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i++;
				j--;
			}
		}
		else{
			while(i < 20 && j > 0){
				if(white == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i++;
				j--;
			}
		}
		return count;
	}
	int leftSearch(int turn ,int row, int column, Board b){
		int count = 0;
		if(turn % 2 == 1){
			for(int j = column;j > 0; j--){
				if(black == b.board[row][j]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		else{
			for(int j = column; j > 0; j--){
				if(white == b.board[row][j]){
					count += 1;
					if(count == 5) break;
				}
			}
		}
		return count;
	}
	int leftUpperSearch(int turn ,int row, int column, Board b){
		int count = 0;
		int i = row;
		int j = column;
		if(turn % 2 == 1){
			while(i > 0 && j > 0){
				if(black == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i--;
				j--;
			}
		}
		else{
			while(i > 0 && j > 0){
				if(white == b.board[i][j]){
					count += 1;
					if(count == 5) break;
				}
				i--;
				j--;
			}
		}
		return count;
	}


	/*int search(int turn, int row, int column, Board b){
		int e = 1;
		int up = row;
		int right = 19 - column;
		int down = 19 - row;
		int left = column;
		int block;
		int count = 0;
		String chip;
		if(turn % 2 == 1) chip = black;
		else chip = white;

		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				
				while(e > 0){
					if(i == 0 && j != 0){
						if(b.board[i][column + j*e] != chip) break;
						count++;
						System.out.println(count);
						if(count == 5) return count;
					}
					else if(i != 0 && j == 0){
						if(b.board[row + i*e][j] != chip)break;
						count++;
						System.out.println(count);
						if(count == 5) return count;
					}
					else if(i == 0 && j == 0) break;
					else {
						if(b.board[row + i*e][column + j*e]  != chip)break;
						count++;
						System.out.println(count);
						if(count == 5) return count;
					}
					System.out.println(count);
					e++;
				}
			}
			
		}
		return count;	
	} */



	boolean jadge(int turn, int row, int column, Board b){
		return (upperSearch(turn,row,column, b) == 5 || 
				rightUpperSearch(turn,row,column,b) == 5 ||
				rightSearch(turn,row,column,b) == 5 ||
				rightUnderSearch(turn,row,column,b) == 5 ||
				underSearch(turn,row,column,b) == 5 ||
				leftUnderSearch(turn,row,column,b) == 5 ||
				leftSearch(turn,row,column,b) == 5 ||
				leftUpperSearch(turn,row,column,b) == 5);

		//return (search(turn, row, column, b) == 5);
	}
}


