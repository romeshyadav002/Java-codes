package backTracking;

public class QueenCombinationBoxRespect {
	public static void QCBoxRespect(boolean[] board, int qpsf, int tq, String ans, int col) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		if(col==board.length) {
			return;
		}
		
		//place
		board[col]=true;
		QCBoxRespect(board, qpsf+1,tq,ans+"q"+qpsf+"b"+col,col+1);
		board[col]=false;
		
		//Not Place
		QCBoxRespect(board, qpsf,tq,ans,col+1);
	}
	public static void main(String[] args) {
		QCBoxRespect(new boolean[4], 0,2,"",0);
	}
}
