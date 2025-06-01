import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    //*은 2x+1 의 규칙으로 찍힌다.
    for(int i=0;i<2*N-1;i++){
      if(i<N){ //N번째 줄까지
        for(int j=0;j<N-1-i;j++){
          System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++){
          System.out.print("*");
        }
        System.out.println();
      }else{ //N번째 줄 이후
        for(int j2=0;j2<i-N+1;j2++){
          System.out.print(" ");
        }
        for(int k2=0;k2<2*(2*N-2-i)+1;k2++){
          System.out.print("*");
        }
        System.out.println();
      }
      
    }
  }
}