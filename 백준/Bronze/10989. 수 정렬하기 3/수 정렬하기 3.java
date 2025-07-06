import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    //카운팅 정렬
    int[] arr = new int[N];
    int max = 0;
    for(int i=0;i<N;i++){
      arr[i] = Integer.parseInt(br.readLine());
      if(max<arr[i]){
        max=arr[i];
      }
    }
    max++;
    int[] counting = new int[max];
    
    //arr[i]값에 해당하는 인덱스에 1증가
    for(int i=0;i<N;i++){
      counting[arr[i]]++;
    }

    //counting 누적합 배열
    for(int i=0;i<max-1;i++){
      counting[i+1]=counting[i]+counting[i+1];
    }
  
    int[] result = new int[N]; //결과 배열
    //arr배열 뒤에서부터 탐색.
    //arr[i] 의 값에 해당하는 counting index의 값 -1 해주고 해당 값을 인덱스로 하는 result배열에 삽입
  
    for(int i=N-1;i>=0;i--){
      counting[arr[i]]--;
      result[counting[arr[i]]]=arr[i];
    }
    for(int i=0;i<N;i++){
      bw.write(result[i]+"\n");
    }
    bw.close();
  }
}