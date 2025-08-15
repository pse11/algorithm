import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new char[N][N];
		
		star(0,0,N,false);
		
		//결과 출력
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
}
	//x,y : 현재 찍을 구역의 왼쪽 위 좌표, N: 현재 구역의 크기(정사각형 한 변), blank: 현재 구역이 공백으로 채워질지 여부
	public static void star(int x, int y, int N, boolean blank) {
		//현재 구역이 공백칸일 경우
		if(blank) { //blank=true인 구역은 전부 공백으로 채움.더 이상 재귀하지 않고 return
			for(int i=x;i<x+N;i++) {
				for(int j=y;j<y+N;j++) {
					arr[i][j]=' ';
				}
			}
			return;
		}
		//재귀 종료 : 가장 작은 단위 (1x1)일때 별 찍기
		//N=1이면 더 쪼갤 수 없음
		if(N==1) {
			arr[x][y]='*';
			return;
		}
		//
		int nextN = N/3;
		int count = 0;
		//9개 구역으로 나누어서 재귀 호출
		for(int i=x;i<x+N;i+=nextN) {
			for(int j=y;j<y+N;j+=nextN) {
				count++;
				if(count==5) { //5번째 칸이 가운데 영역이기 때문에 blank=true
					star(i,j,nextN,true);
				}else {
					star(i,j,nextN,false);
				}
				
			}
		}
		
	}
}