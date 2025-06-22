import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String[] arr = br.readLine().split(" ");
      int[] iarr = new int[arr.length];
      for(int i=0;i<arr.length;i++){
        iarr[i]=Integer.parseInt(arr[i]);
      }
      Arrays.sort(iarr);
      int sum = 0;
      if(iarr[2]<iarr[1]+iarr[0]){//삼각형 조건 만족시 전체 합 출력
        sum=iarr[0]+iarr[1]+iarr[2];
      }else{ //삼각형 조건 만족시 길이 변경필요
        iarr[2]=iarr[0]+iarr[1]-1;
        sum=iarr[0]+iarr[1]+iarr[2];
      }
      bw.write(sum+"");
      bw.close();
  }
}