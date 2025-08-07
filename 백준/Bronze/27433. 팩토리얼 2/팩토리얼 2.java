import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
		
		//13!까지만 int형 가능.
		//20!까지는 long형 가능.
		//그 이상일 땐 BigInteger
	}
	public static long factorial(int N) {
		if(N<=1) {
			return 1;
		}
		return N*factorial(N-1);
	}

}
