import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int[] arr = new int[4];
    arr[0]=x;
    arr[1]=y;
    arr[2]=w-x;
    arr[3]=h-y;
    int min = arr[0];
    for(int i : arr){
      if(min>i){
        min=i;
      }
    }
    bw.write(min+"");
    bw.close();
    
  }
}