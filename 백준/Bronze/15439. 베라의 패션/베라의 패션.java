import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//총 가능한 조합 : N*N
		//상하의 같은 경우 : N
		//문제 조건에 맞는 조합 : N*N-N = N(N-1)
		System.out.println(N*(N-1));
	}
}
