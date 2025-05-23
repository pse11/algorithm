import java.io.*;
import java.util.StringTokenizer;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //입력한 값 받아오기
    StringTokenizer str = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(str.nextToken());
    int M = Integer.parseInt(str.nextToken());

    //바구니 배열
    int[] arr = new int[N];
    //공 넣기
    for(int i=0;i<N;i++){
      arr[i]=(i+1);
    }
    //공 바꾸기
    for(int p=0;p<M;p++){
      int tmp =0;
      str = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(str.nextToken());
      int j = Integer.parseInt(str.nextToken());
      //주의 배열 값을 바꾸는것이다!
      tmp=arr[i-1];
      arr[i-1]=arr[j-1];
      arr[j-1]=tmp;
    }
    for(int i=0;i<N;i++){
      bw.write(arr[i]+" ");
    }
    bw.flush();
    bw.close();
  }
}