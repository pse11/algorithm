import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr; 
	static int N,M;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		backtrack(1,0);
		System.out.println(sb);
		
	}
	public static void backtrack(int at, int depth) { 
		if(depth==M) {
			for(int val:arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=at;i<=N;i++) {
			arr[depth]=i;
			backtrack(i+1,depth+1);
		}
	}
}