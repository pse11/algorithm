import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int min = N;
    for(int i=2;i<N;i++){
      String[] iarr = (i+"").split(""); //i 각 자리수로 나누기
      int sum = i;
      for(int j=0;j<iarr.length;j++){
        sum+=Integer.parseInt(iarr[j]);
      }
      if(N==sum&&i<min){
        min=i;
      }
    }
    if(min==N){//생성자 없는 경우
      bw.write("0");
    }else{
      bw.write(min+"");
    }
    bw.flush();
    bw.close();
  }
}