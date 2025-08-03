import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//nCk 구하는 조합론
		System.out.println(fact(N)/fact(K)/fact(N-K));
	}
	public static int fact(int i) {
		return (i<=1)?1:i*fact(i-1);
	}
}
