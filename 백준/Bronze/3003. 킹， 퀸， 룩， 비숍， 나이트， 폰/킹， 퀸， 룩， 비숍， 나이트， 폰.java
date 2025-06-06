import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] opiece = new int[]{1,1,2,2,2,8}; //모든 체스 피스 총 16개
    String[] input = br.readLine().split(" ");
    for(int i=0;i<opiece.length;i++){
      bw.write(opiece[i]-Integer.parseInt(input[i])+" ");
    }
    bw.close();
  }
}