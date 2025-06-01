import java.io.*;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String[] A = st.nextToken().split("");
    String[] B = st.nextToken().split("");

    //역순으로 바꾸기
    String tmp ="";
    tmp=A[0];
    A[0]=A[2];
    A[2]=tmp;
    tmp=B[0];
    B[0]=B[2];
    B[2]=tmp;
    String As = String.join("",A);
    String Bs = String.join("",B);
    if(Integer.parseInt(As)>Integer.parseInt(Bs)){
      bw.write(As+"");
    }else{
      bw.write(Bs+"");
    }
    bw.close();
  }
}