import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    for(int i=0;i<T;i++){
      String[] ps = br.readLine().split("");
      Stack<String> stack = new Stack<>();
      // "("일 경우 push, ")" 일 경우 pop한다. 스택이 최종 비어있어야 VPS가 된다.
      for(String s:ps){
        if(s.equals("(")){
          stack.push(s);
        }else{
          if(stack.size()!=0){
            stack.pop();
          }else{
            stack.push(")");
            break;
          }
        }
      }
      String res = stack.isEmpty()?"YES":"NO";
      System.out.println(res);
    }
  }
}