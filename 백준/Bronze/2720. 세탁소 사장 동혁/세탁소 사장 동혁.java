import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    int[][] result = new int[T][4];
    for(int i=0;i<T;i++){
      int C = Integer.parseInt(br.readLine());
      result[i][0]=(int)C/25;
      result[i][1]=(int)(C%25)/10;
      result[i][2]=(int)(C%25%10)/5;
      result[i][3]=(int)(C%25%10%5);
    }

    for(int i=0;i<T;i++){
      for(int j=0;j<4;j++){
        bw.write(result[i][j]+" ");
      }
      bw.write("\n");
    }
    bw.close();
  }
}