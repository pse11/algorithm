import java.util.StringTokenizer;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    List<Integer> arr = new ArrayList<>();
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr.add(Integer.parseInt(st.nextToken()));
    }

    Collections.sort(arr);
    for(int i=0;i<n;i++){
      bw.write(arr.get(i)+"\n");
    }
    bw.close();
  }
}