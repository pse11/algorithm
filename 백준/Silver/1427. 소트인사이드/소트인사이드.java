import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int count = (N+"").length();
    int[] arr = new int[count];
    String[] sarr = (N+"").split(""); //숫자 자리수를 나눈 배열
    for(int i=0;i<count;i++){
      arr[i]=Integer.parseInt(sarr[i]);
    }

    for(int i=0;i<count-1;i++){
      for(int j=i+1;j<count;j++){
        if(arr[i]<arr[j]){
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
    for(int i=0;i<count;i++){
      bw.write(arr[i]+"");
    }
    bw.close();
  }
}