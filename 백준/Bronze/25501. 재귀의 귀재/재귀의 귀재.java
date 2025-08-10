import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
	static int count = 0; //recursion 함수 호출 횟수 저장할 변수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//테스트케이스 개수
		int T = Integer.parseInt(br.readLine());

		for(int i=0;i<T;i++) {
			String s = br.readLine();
			count = 0;    //isPalindrome 함수 호출 전 count 초기화
			sb.append(isPalindrome(s)+" ");
			sb.append(count+"\n");
		}
		System.out.println(sb);
	}
	
	public static int recursion(String s, int l, int r) {
		count++; //함수 호출 시마다 1 증가
		if(l>=r) return 1;
		else if(s.charAt(l)!=s.charAt(r)) return 0;
		else return recursion(s, l+1, r-1);
	}
	
	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
}
