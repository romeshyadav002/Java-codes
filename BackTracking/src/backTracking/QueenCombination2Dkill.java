package backTracking;

public class QueenCombination2Dkill {
	public static void qcCombinationBoxRespect2DKill(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
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
		if(isItSafeToPlace(board,row,col)) {
			board[row][col]=true;
			qcCombinationBoxRespect2DKill(board,row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
			board[row][col]=false;
			
		}
		//not place
		qcCombinationBoxRespect2DKill(board, row, col+1, qpsf,tq,ans);
	}

	public static boolean isItSafeToPlace(boolean[][] board, int row, int col) {
		//Vertically Upward
		int r=row-1;
		int c = col;
		while(r>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
		}
		//Horizontally left
		r=row;
		c=col-1;
		while(c>=0) {
			if(board[r][c]) {
				return false;
			}
			c--;
		}
		//diagonally left
		r=row-1;
		c=col-1;
		while(r>=0 && c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		//diagonally right
		r=row-1;
		c=col+1;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static void main(String[] args) {
		qcCombinationBoxRespect2DKill(new boolean[3][4],0,0,0,3,"");
	}
}
