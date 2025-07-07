import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int count = -1;
    int min=N/3+1;
    for(int x=0;x<=N/5;x++){
      for(int y=0;y<=N/3;y++){
        if(5*x+3*y==N){
          count=x+y;
          min = Math.min(min,count);
          break;
        }
      }
    }
    System.out.println(min==N/3+1?-1:min);
  }
}