import java.io.*;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int sum = 0;
    int max = 0;
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<N;i++){
      for(int j=i+1;j<N;j++){
        for(int k=j+1;k<N;k++){
          sum=arr[i]+arr[j]+arr[k];
          if(sum<=M&&sum>max){ 
            max=sum; 
          }
        }
      }
    }
    bw.write(max+"");
    bw.close();
  }
}