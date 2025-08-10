import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[] arr = new int[21]; //0~20까지의 계산 값 저장
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			if(arr[n]>0) { //이미 값이 계산된 경우
				return arr[n];
			}
			arr[n] = fibo(n-1)+fibo(n-2);
			return arr[n];
		}
	}
}
