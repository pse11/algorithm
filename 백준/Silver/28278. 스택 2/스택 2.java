import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //java의 stack 클래스로 구현
    Stack<Integer> stack = new Stack<>();
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    for(int i=0;i<N;i++){
      st = new StringTokenizer(br.readLine());
      //명령 입력
      int command = Integer.parseInt(st.nextToken());
      int res = 0;
      switch (command) {
        case 1:
          int x = Integer.parseInt(st.nextToken());
          stack.push(x);
          break;
        case 2:
          res = stack.isEmpty()?-1:stack.pop(); //pop : 스택의 맨 위요소를 제거하고 반환
          System.out.println(res);
          break;
        case 3:
          System.out.println(stack.size());
          break;
        case 4:
          res = stack.isEmpty()?1:0;
          System.out.println(res);
          break;
        case 5:
          res = stack.isEmpty()?-1:stack.peek(); //peek: 스택의 맨 위 요소를 반환하지만 제거는 하지 않음
          System.out.println(res);
          break;
      }
    }
    /*
     *  List로 스택 구현
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
            System.out.println(-1);
          }else{
            System.out.println(stack.get(stack.size()-1));
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
            System.out.println(-1);
          }else{
            System.out.println(stack.get(stack.size()-1));
          }
          break;
      }
    }
      */
  }
}