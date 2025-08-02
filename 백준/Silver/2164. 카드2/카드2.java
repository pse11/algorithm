import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		//카드 놓기
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		
		//카드가 한장 남을 때까지 동작 반복
		while(q.size()!=1) {
			//맨 위 카드 버리기
			q.remove();
			//그다음 맨 위 카드 아래로 넣기
			q.add(q.peek());
			q.remove();
		}
		System.out.println(q.peek());
	}
}
