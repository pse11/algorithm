import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] arr = new int[9][9];
    int max = 0;
    int row = 0;
    int col = 0;

    for(int i=0;i<9;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<9;j++){
        arr[i][j]=Integer.parseInt(st.nextToken());
        if(max<arr[i][j]){
          max=arr[i][j];
          col=i;
          row=j;
        }
      }
    }
    bw.write(max+"\n"+(col+1)+" "+(row+1));
    bw.newLine();
    bw.flush();
    bw.close();
  }
}