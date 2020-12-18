
class Board{
	public String board[][] = new String[20][20];
	private int boardRow = 1;
	private int boardColumn = 1;
	private String blank = "□";
	Board(){
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				if(i == 0 && j != 0){
					board[i][j] = Integer.toString(boardRow);
					if(j < 10){
						board[i][j] += " ";
					}
					boardRow++;
				} 
				else if(i != 0 && j == 0){
					board[i][j] = Integer.toString(boardColumn);
					if(i < 10){
						board[i][j] += " ";
					}
					boardColumn++;
				}
				else if(i == 0 && j == 0){
					board[i][j] = "　";
				}
				else{
					board[i][j] = blank;
				}
			}
		}
	}
	
	void disp(){
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	boolean reload(int row, int column, String chip){
		if(row > 19 || column > 19){
			System.out.println("そこには置けません");
			return false;
		}
		else if(board[row][column] != blank){
			System.out.println("そこには置けません");
			return false;
		}
		else{
			board[row][column] = chip;
			return true;
		}
	}

}

