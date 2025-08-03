import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//다리의 순서를 고려해하는 조합이다.
		//서쪽 사이트가 2개 동쪽 사이트가 3개일 경우 3개 중에 서쪽에 연결할 2개를 골라야 한다.
		//이때 동쪽 사이트를 번호 1,2,3으로 매기면 가능한 경우는 (1,2)(1,3)(2,3)이다. 이때 순열을 하게 되면(2,1)도 포함되기 때문에 다리가 겹치게 된다.
		//따라서 mCn으로 다리 개수를 구해야한다.
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			System.out.println(fact(M).divide(fact(N)).divide(fact(M-N)));
			
		}
	}
	public static BigInteger fact(int N) {
		return (N<=1)?BigInteger.ONE:fact(N-1).multiply(new BigInteger(N+""));
	}
}
