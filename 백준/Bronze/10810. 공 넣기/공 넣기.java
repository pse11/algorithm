import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String NM = bf.readLine();
    StringTokenizer st = new StringTokenizer(NM);
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N]; //바구니 배열
    for(int idx=0;idx<M;idx++){
      StringTokenizer st2 = new StringTokenizer(bf.readLine());
      int i,j,k;
      i=Integer.parseInt(st2.nextToken());
      j=Integer.parseInt(st2.nextToken());
      k=Integer.parseInt(st2.nextToken());

      for(int p=i-1;p<j;p++){
        arr[p]=k;
      }
    }
    for(int i=0;i<N;i++){
      System.out.print(arr[i]+" ");
    }
  }
}