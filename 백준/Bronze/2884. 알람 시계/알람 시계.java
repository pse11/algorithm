import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    if(m>=45){ //분이 45분보다 클때
      m-=45;
    }else{ // 분이 45분보다 작을때 시에서 분을 가져온다. 단 0시일 경우 23시로 변경해줘야한다.
      if(h==0){
        h=23;
      }else{
        h--;
      }
      m=m+60-45;
    }
    System.out.println(h+" "+m);
  }
}