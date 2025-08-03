import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		//서로 다른 색상으로 조합해야하기 때문에
		//i와 j가 다를 경우에만 count++
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i!=j) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
