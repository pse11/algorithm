import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //입력 개수 N
		
		int[] arr = new int[N];
		int sum = 0; //총 합계(산술평균 계산용)
		for(int i=0;i<N;i++) {
			int k = Integer.parseInt(br.readLine());
			arr[i] = k;
			sum+=k;
		}
		
		Arrays.sort(arr);	//중앙값, 범위, 최빈값 계산에 필요
		
		//최빈값 계산에 필요한 변수들
		int count = 0;	//동일한 값이 연속으로 나타날 때 증가시킬 count
		int max = Integer.MIN_VALUE;	//최빈값의 최대갯수
		
		int mod = arr[0];	//최빈값
		boolean check = false;	//값이 첫등장인지 체크. 첫 등장하면 true, 아니면 false
		
		//최빈값 구하기
		for(int i=0;i<N-1;i++) {
			if(arr[i]==arr[i+1]) { //같은 값이 나타나면 count 증가
				count++;
			}else {		//값이 다르면 count 초기화
				count=0;
			}
			
			//새로운 최빈값 등장
			if(max<count) { 
				max=count;
				mod=arr[i];
				check=true;
			}
			//최빈값 개수가 같고, 첫 등장 이후라면 두 번째 최빈값 저장
			else if(max==count&&check==true) {
				mod=arr[i];
				check=false;	//이후에 최빈값 개수가 같은 값이 등장해도 false이기 때문에 만족하는 조건이 없어서 통과함
			}
		}
		//산술평균
		System.out.println(Math.round((double)sum/N));
		//중앙값
		System.out.println(arr[N/2]);
		//최빈값
		System.out.println(mod);
		//범위
		System.out.println(arr[N-1]-arr[0]);
	}
}