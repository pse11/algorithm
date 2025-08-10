import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long[] arr=new long[21]; //팩토리얼 값을 저장할 배열, arr[i]는 i! 값을 저장
									//0~20까지 팩토리얼 저장
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));
		
	}
	//재귀
//	public static long factorial(int N) {
//		if(N<=1) {
//			return 1;
//		}
//		return N*factorial(N-1);
//	}
	//메모이제이션
	public static long factorial(int N) {
		if(N==0||N==1) {
			return 1;
		}
		if(arr[N]!=0) {//이미 계산된 값이 있으면 바로 리턴
			return arr[N];
		}
		arr[N] = N*factorial(N-1); //재귀 호출하면서 계산 후 저장
		return arr[N];
	}
}
