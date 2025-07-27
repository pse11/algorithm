import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //명령 수 N 입력
    int N = Integer.parseInt(br.readLine());
    //stack 선언
    List<Integer> stack = new ArrayList<>();
    StringTokenizer st = null;
    for(int i=0;i<N;i++){
      st = new StringTokenizer(br.readLine());
      int command = Integer.parseInt(st.nextToken());
      //명령 처리
      switch (command) {
        case 1:
          int x = Integer.parseInt(st.nextToken());
          stack.add(x);
          break;
        case 2:
          if(stack.size()==0){
            System.out.println("-1");
          }else{
            System.out.println(stack.get(stack.size()-1)+"");
            stack.remove(stack.size()-1);
          }
          break;
        case 3:
          System.out.println(stack.size());
          break;
        case 4:
          int res = (stack.size()==0)?1:0;
          System.out.println(res);
          break;
        case 5:
          if(stack.size()==0){
            System.out.println("-1");
          }else{
            System.out.println(stack.get(stack.size()-1));
          }
          break;
      }
    }
  }
}