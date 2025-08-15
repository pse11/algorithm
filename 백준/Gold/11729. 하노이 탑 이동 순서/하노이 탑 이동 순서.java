import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int count = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N,1,3);
		sb.insert(0, count+"\n");
		System.out.println(sb);
	}
	public static void hanoi(int no, int x, int y) {
		
		count++;
		if(no>1) { //x에 있는 n-1개의 원판을 가운데 기둥으로 옮긴다.
			hanoi(no-1,x,6-x-y);
		}
		sb.append(x+" "+y).append("\n");
		if(no>1) { //가운데 기둥에 있는 n-1개의 원판을 y로 옮긴다.
			hanoi(no-1,6-x-y,y);
		}
	}
	
}