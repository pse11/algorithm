import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    char[][] arr = new char[5][15];
    
    for(int i=0;i<5;i++){
      String str=br.readLine();
      for(int j=0;j<str.length();j++){  //arr 값 채우기
        arr[i][j]=str.charAt(j);
      }
    }
    for(int i=0;i<15;i++){
      for(int j=0;j<5;j++){
        if(arr[j][i]=='\u0000'){
          continue;
        }
        System.out.print(arr[j][i]);
      }
    }
  }
}