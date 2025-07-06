import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int count = -1;
    for(int x=0;x<=1000;x++){
      for(int y=0;y<=1666;y++){
        if(5*x+3*y==N){
          count=x+y;
        }
      }
    }
    System.out.println(count);
  }
}