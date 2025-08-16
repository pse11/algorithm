import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr; //현재까지 선택한 수열
	static boolean[] visit; //이미 선택한 수인지 체크
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		backtrack(N,M,0);
		System.out.println(sb);
		
	}
	public static void backtrack(int N, int M, int depth) { //depth : 현재 수열에서 몇 번째 자리를 채우고 있는지
		if(depth==M) {
			for(int val:arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[depth]=i+1;
				backtrack(N,M,depth+1);
				visit[i]=false; //백트래킹 : 재귀 종료 후 상태 되돌리기
			}
		}
	}
}