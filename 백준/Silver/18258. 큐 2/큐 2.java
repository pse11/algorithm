import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push":
				int X = Integer.parseInt(st.nextToken());
				q.add(X);
				break;
			case "pop":
				if(q.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(q.peek()+"\n");
					q.remove();
				}
				break;
			case "size":
				sb.append(q.size()+"\n");
				break;
			case "empty":
				int res = (q.isEmpty())?1:0;
				sb.append(res+"\n");
				break;
			case "front":
				if(q.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(q.peek()+"\n");
				}
				break;
			case "back":
				if(q.isEmpty()) {
					sb.append("-1\n");
				}else {
					Deque<Integer> d = (Deque<Integer>) q;
					sb.append(d.getLast()+"\n");
				}
				break;
			}
		}
    System.out.println(sb);
	}
}
