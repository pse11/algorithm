import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] str = br.readLine().trim().split(" ");

    if(str.length==1&&str[0].isEmpty()){
      bw.write("0");
    }else{
      bw.write(str.length+"");
    }
    bw.close();
  }
}