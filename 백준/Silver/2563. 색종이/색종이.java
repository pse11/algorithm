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
        //사각형을 종이에 한칸씩 채워넣는다.
      for(int j=x;j<x+10;j++){
        for(int k=y;k<y+10;k++){
          arr[j][k]=1;
        }
      }
    }
    int sum =0;
    for(int i=0;i<100;i++){
      for(int j=0;j<100;j++){ //종이가 1로 채워져있는 경우를 더해 면적을 구한다.
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