import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int[] arr;
	public static int N;
	public static int count = 0;
	
	public static void main(String[] args) throws IOException{
		//퀸의 이동 
		//수평, 수직, 대각선 모든 방향 이동 가능
		//같은 행, 같은 열, 같은 대각선에는 퀸을 두면 안 됨
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		nQueen(0);
		System.out.println(count);
	}
	
	public static void nQueen(int depth) {
		if(depth==N) {
			count++;
			return;
		}
		
		for(int i=0;i<N;i++) {
			arr[depth]=i;
			if(Possibility(depth)) {
				nQueen(depth+1);
			}
		}
	}
	public static boolean Possibility(int col) {
		for(int i=0;i<col;i++) {
			if(arr[col]==arr[i]) {
				return false;
			}
			
			//대각선상에 놓여있는 경우
			//열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우
			else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])) {
				return false;
			}
		}
		return true;
	}
}