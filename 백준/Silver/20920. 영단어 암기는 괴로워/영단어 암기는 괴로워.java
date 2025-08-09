import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		//단어의 개수
		int N = Integer.parseInt(st.nextToken());
		//단어 길이 기준
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			String word = br.readLine();
			if(word.length()>=M) {
				map.put(word, map.getOrDefault(word, 0)+1); //처음 나온 단어는 1 저장,그 이후에는 1씩 증가
			}
		}
		List<String> list = new ArrayList<>(map.keySet());
		//단어의 길이로 정렬
		Comparator<String> comparator = new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				//자주 나오는 단어를 앞에 배치
				//map에 저장된 나온 횟수로 비교
				if(Integer.compare(map.get(s1), map.get(s2))!=0) {
					return Integer.compare(map.get(s2),map.get(s1));
				}
				//단어의 길이가 길수록 앞에 배치
				if(s1.length()!=s2.length()) {
					return s2.length()-s1.length();
				}
				//알파벳 사전 순으로 배치
				return s1.compareTo(s2);
			}
		};
		list.sort(comparator);
		
		for(String str:list) {
			sb.append(str+"\n");
		}
		System.out.println(sb);
	}
}