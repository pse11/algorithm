import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//set사용하여 중복저장되지 않게 해서 add된 횟수를 센다.
		//enter일 때는 기존에 저장된 set을 clear시킨다.
		
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int count = 0;
		for(int i=0;i<N;i++) {
			String st = br.readLine();
			if(st.equals("ENTER")) {
				set.clear();
			}else {
				if(set.contains(st)){continue;}
				set.add(st);
				count++;
			}
		}
		System.out.println(count);
	}
}
