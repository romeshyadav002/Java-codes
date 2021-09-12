package backTracking;

public class QueenCombination2D {
	public static void QCBoxRespect(boolean[][] board, int row, int col,int qpsf, int tq, String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		if(col==board[0].length) {
			row++;
			col=0;
		}
		if(row==board.length) {
			return;
		}
		
		//place
		board[row][col]=true;
		QCBoxRespect(board,row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
		board[row][col]=false;
		
		//not place
		QCBoxRespect(board, row, col+1, qpsf,tq,ans);
	}
	public static void main(String[] args) {
		QCBoxRespect(new boolean[2][2],0,0,0,2,"");
	}
}
