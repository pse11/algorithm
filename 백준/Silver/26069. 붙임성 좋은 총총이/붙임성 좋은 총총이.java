import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>(); //무지개 댄스를 추는 사람들 모음 set
		set.add("ChongChong");
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			String B = st.nextToken();
			if(set.contains(A)||set.contains(B)) { //set에 A나 B가 있다면 무지개 댄스를 추는 사람이기 때문에 둘 다 set에 add해준다.
				set.add(A);
				set.add(B);
			}
		}
		System.out.println(set.size());
	}
}