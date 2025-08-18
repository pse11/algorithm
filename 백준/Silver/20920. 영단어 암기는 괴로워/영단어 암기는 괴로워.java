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
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			if(str.length()>=M) {
				map.put(str, map.getOrDefault(str, 0)+1);
			}
		}
		List<String> list = new ArrayList<>(map.keySet());
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(Integer.compare(map.get(s1),map.get(s2))!=0) {
					return Integer.compare(map.get(s2), map.get(s1));
				}
				if(s1.length()!=s2.length()) {
					return s2.length()-s1.length();
				}
				return s1.compareTo(s2);
			}
		};
		list.sort(comparator);
		
		for(String str: list) {
			sb.append(str+"\n");
		}
		System.out.println(sb);
	}
}