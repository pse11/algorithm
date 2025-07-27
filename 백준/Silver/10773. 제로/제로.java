import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int K = Integer.parseInt(br.readLine());
    //1. ArrayList로 구현
    /*
    List<Integer> stack = new ArrayList<>();
    for(int i=0;i<K;i++){
      int n = Integer.parseInt(br.readLine());
      if(n==0){
        stack.remove(stack.size()-1);
      }else{
        stack.add(n);
      }
    }
    int sum = 0;
    for(int i=0;i<stack.size();i++){
      sum += stack.get(i);
    }
    System.out.println(sum);
    */
    //2. Stack 클래스로 구현
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<K;i++){
      int n = Integer.parseInt(br.readLine());
      if(n==0){
        stack.pop();
      }else{
        stack.push(n);
      }
    }
    int sum = 0;
    int size = stack.size();
    for(int i=0;i<size;i++){
      sum+=stack.pop();
    }
    System.out.println(sum);
  }
}