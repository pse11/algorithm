
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();

		if(N!=1){
			for(int i=2;i<=N;i++){
				while(N%i==0){
					N /=i;
					sb.append(i+"\n");
				}
			}
		}
		System.out.println(sb);
	}	
}