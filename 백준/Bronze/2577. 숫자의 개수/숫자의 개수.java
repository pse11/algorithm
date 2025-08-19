import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10]; //0~9까지의 카운팅 배열
		
		String[] result = (A*B*C+"").split("");
		for(int i=0;i<result.length;i++) {
			int k = Integer.parseInt(result[i]);
			arr[k]++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}