import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[100][100];
    for(int i=0;i<n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x=Integer.parseInt(st.nextToken());
      int y =Integer.parseInt(st.nextToken());

      for(int j=x;j<x+10;j++){
        for(int k=y;k<y+10;k++){
          arr[j][k]=1;
        }
      }
    }
    int sum =0;
    for(int i=0;i<100;i++){
      for(int j=0;j<100;j++){
        if(arr[i][j]==1){
          sum+=arr[i][j];
        }
      }
    }
    bw.write(sum+"");
    bw.flush();
    bw.close();
  }
}