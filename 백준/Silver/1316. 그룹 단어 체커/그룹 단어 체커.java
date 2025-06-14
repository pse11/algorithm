import java.util.Scanner;
public class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int N = sc.nextInt();
    int count = 0;
    for(int i=0;i<N;i++){
      if(check()==true){
        count++;
      }
    }
    System.out.println(count);
  }
  public static boolean check(){
    boolean check[] = new boolean[26]; //알파벳별 존재했던건지 확인하는 배열
    int bf = 0;
    String str =sc.next(); 
    for(int i=0;i<str.length();i++){
      int now = str.charAt(i);
      if(bf!=now){//앞의 문자와 i번째 문자가 다른경우
        //처음 나오는 문자인 경우
        if(check[now-'a']==false){ //now-'a' 아스키코드로 바꿔서 알파벳인덱스가 0부터 시작할수있도록
          check[now-'a']=true; //이제 처음나오는문자가 아니다.
          bf = now;
        }else{//처음 나오는 문자가 아닌경우
          return false;
        }
      }else{ //앞의 문자와 같은 경우에는 다음 문자로 넘어간다
        continue;
      }
    }
    return true;
  }
}