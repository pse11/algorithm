import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//자료구조 개수 N
		int N = Integer.parseInt(br.readLine());
		//수열 A
		int[] A = new int[N];		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		int[] B = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		Deque<Integer> d = new ArrayDeque<>();
		for(int i=0;i<N;i++) {
			if(A[i]==0) {
				d.addLast(B[i]);
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int c = Integer.parseInt(st.nextToken());
			d.addFirst(c);
			sb.append(d.pollLast()+ " ");
		}
		System.out.println(sb);
	}
}
