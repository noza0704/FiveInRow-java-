

class SetChip{
	private String black = "●";
	private String white = "〇";

	String set(int turn){
		if(turn % 2 == 1){
			return black;
		}
		else{
			return white;
		}	
	}
	
}


