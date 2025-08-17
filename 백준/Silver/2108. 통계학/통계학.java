import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			int k = Integer.parseInt(br.readLine());
			arr[i]= k;
			sum += k;
		}
		
		//산술평균
		sb.append(Math.round((double)sum/N)).append("\n");
		
		//중앙값
		Arrays.sort(arr);
		sb.append(arr[N/2]).append("\n");
		
		//최빈값
		int count = 0;
		int max = Integer.MIN_VALUE;
		
		int mod = arr[0];
		boolean check = false;
		
		for(int i=0;i<N-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else {
				count=0;
			}
			if(max<count) {
				max=count;
				mod=arr[i];
				check=true;
			}
			
			else if(max==count&&check==true) {
				mod=arr[i];
				check=false;
			}
		}
		sb.append(mod).append("\n");
		//범위
		sb.append(arr[N-1]-arr[0]).append("\n");
		
		System.out.println(sb);
	}
}