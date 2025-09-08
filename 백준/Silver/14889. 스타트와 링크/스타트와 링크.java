import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static int N;
	public static int min = Integer.MAX_VALUE;
	public static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N];

		// 능력치 입력
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());

			}
		}

		// 조합
		combi(0, 0);

		System.out.println(min);
	}

	// index : 현재 사람 인덱스, count : 선택한 사람 수
	public static void combi(int index, int count) {
		if (count == N / 2) {
			// 방문한 팀과 방문하지 않은 팀 나누고 최소값 찾기
			calcDiff();

			return;
		}

		for (int i = index; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				combi(i + 1, count + 1);
				visit[i] = false;
			}
		}
	}

	// 두 팀의 능력치 차이 계산
	public static void calcDiff() {
		int start = 0;
		int link = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visit[i] == true && visit[j] == true) {
					start += arr[i][j];
					start += arr[j][i];
				} else if (visit[i] == false && visit[j] == false) {
					link+=arr[i][j];
					link+=arr[j][i];
				}
			}
		}
		int val = Math.abs(start-link);
		
		if(val==0) {
			System.out.println(val);
			System.exit(0);
		}
		min = Math.min(val, min);
	}
}