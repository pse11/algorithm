import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		//진짜 약수를 오름차순으로 정렬한 후 양 끝에 있는 값을 곱하면 N이 된다.
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<T;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[T-1]);
	}
	
}
