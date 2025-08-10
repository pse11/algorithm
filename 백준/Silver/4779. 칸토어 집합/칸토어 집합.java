import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		char[] arr;
		while((s=br.readLine())!=null) {
			int N = Integer.parseInt(s);
			int length = (int) Math.pow(3, N);
			arr=new char[length];
			for(int i=0;i<arr.length;i++) {
				arr[i]='-';
			}
			cantor(arr,0,length);
			System.out.println(new String(arr));
		}
	}
	
	public static void cantor(char[] arr, int start, int length) {
		if(length==1)return; //길이가 1이면 멈춤
		
		int mid = length/3;
		
		for(int i=start+mid; i<start+2*mid;i++) {
			arr[i]=' ';
		}
		
		cantor(arr, start,mid);
		cantor(arr,start+2*mid,mid);
	}
}