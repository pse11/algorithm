import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;
    int N = Integer.parseInt(br.readLine());
    String[][] arr = new String[N][2];
    for(int i=0;i<N;i++){
      st = new StringTokenizer(br.readLine());
      arr[i][0] = st.nextToken();
      arr[i][1] = st.nextToken();
    }

    Arrays.sort(arr, new Comparator<String[]>(){
      @Override
      public int compare(String[] s1, String[] s2){
        return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
      }
    });

    for(int i=0;i<N;i++){
      System.out.println(arr[i][0]+" "+arr[i][1]);
    }
  }
}