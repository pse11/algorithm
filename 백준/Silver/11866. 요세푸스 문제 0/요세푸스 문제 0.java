import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		
		
		//N명 원으로 자리 앉기
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		sb.append("<");
		
		//마지막 번호 전까지 출력하기 위해 size>1로 조건
		while(q.size()>1) {
			for(int i=0;i<K-1;i++) {
				q.add(q.poll());
			}
			sb.append(q.peek());
			q.poll();
			sb.append(", ");
		}		
		sb.append(q.poll()).append(">");
		System.out.println(sb);
	}
}
