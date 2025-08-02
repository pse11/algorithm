import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		Deque<Integer> d = new LinkedList<>();
		//명령 수 N
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			st =  new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "1":
				int X1 = Integer.parseInt(st.nextToken());
				d.addFirst(X1);
				break;
			case "2":
				int X2 = Integer.parseInt(st.nextToken());
				d.addLast(X2);
				break;
			case "3":
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.pollFirst()+"\n");
				}
				break;
			case "4":
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.pollLast()+"\n");
				}
				break;
			case "5":
				sb.append(d.size()+"\n");
				break;
			case "6":
				int res = (d.isEmpty())?1:0;
				sb.append(res+"\n");
				break;
			case "7":
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.getFirst()+"\n");
				}
				break;
			case "8":
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.getLast()+"\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}
}
