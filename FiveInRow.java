
import java.util.Scanner;

class FiveInRow{
	public static void main(String[] args){
		int turn = 1;
		int row = 0;
		int column = 0;
		Scanner scanner = new Scanner(System.in);
		Board board = new Board();
		SetChip setchip = new SetChip();
		Jadge jadge = new Jadge();
		board.disp();
		while(turn > 0){
			if(turn % 2 == 1){
				System.out.printf("%dターン目　黒番です\n",turn);
				System.out.println("どこに置きますか？");
				row = scanner.nextInt();
				column = scanner.nextInt();
				while(!board.reload(row, column, setchip.set(turn))){
					System.out.println("どこに置きますか？");
					row = scanner.nextInt();
					column = scanner.nextInt();
				}
				board.disp();
				if(jadge.jadge(turn, row, column, board)){
					System.out.println("黒の勝ちです");
					return;
				}
			}
			else{
				System.out.printf("%dターン目　白番です\n",turn);
				System.out.println("どこに置きますか？");
				row = scanner.nextInt();
				column = scanner.nextInt();
				while(!board.reload(row, column, setchip.set(turn))){
					System.out.println("どこに置きますか？");
					row = scanner.nextInt();
					column = scanner.nextInt();
				}
				board.disp();
				if(jadge.jadge(turn, row, column, board)){
					System.out.println("白の勝ちです");
					return;
				}
			}
			turn++;	
		}
	}
}
