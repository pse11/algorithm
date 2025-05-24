import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer str = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(str.nextToken());
    int M = Integer.parseInt(str.nextToken());

    int[][] arr1 = new int[N][M];
    int[][] arr2 = new int[N][M];
    int[][] sum = new int[N][M];
    //arr1 배열 값 넣기
    for(int i=0;i<N;i++){
        str = new StringTokenizer(br.readLine());
      for(int j=0;j<M;j++){
        arr1[i][j]=Integer.parseInt(str.nextToken());
      }
    }
    //arr2 배열 값 넣기
    for(int i=0;i<N;i++){
      str = new StringTokenizer(br.readLine());
      for(int j=0;j<M;j++){
        
        arr2[i][j]=Integer.parseInt(str.nextToken());
      }
    }
    //배열 합
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        sum[i][j]=arr1[i][j]+arr2[i][j];
        System.out.print(sum[i][j]+" ");
      }
      System.out.println();
    } 
  }
}