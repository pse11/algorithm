import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    char[][] allarr = new char[N][M];

    for(int i=0;i<N;i++){
      String line = br.readLine();
      for(int j=0;j<M;j++){
        allarr[i][j]=line.charAt(j);
      }
    }
    int min=50;
    for(int i=0;i<N-8+1;i++){ //8x8 크기로 잘라서 탐색
      for(int j=0;j<M-8+1;j++){
        int countW = 0; //시작이 W인 경우 다시 칠해야 하는 칸 수
        int countB = 0 ; //시작이 B인 경우 다시 칠해야 하는 칸 수

        for(int x=i;x<i+8;x++){
          for(int y=j;y<j+8;y++){
            char current = allarr[x][y]; //현재 칸의 색
            if((x+y)%2==0){
              if(current!='W') countW++; //시작이 W인 경우 현재 칸(x+y가 짝수일때)이 W가 아니면 색 고쳐야하므로 countW++
              if(current!='B') countB++; //시작이 B인 경우 
            }else{
              if(current!='B') countW++;
              if(current!='W') countB++;
            }
          }
        }
        if(min>Math.min(countB,countW)){
          min=Math.min(countW, countB);
        }
      }
    }
    bw.write(min+"");
    bw.close();
  }
}