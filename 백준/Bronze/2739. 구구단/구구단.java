import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i=1;i<=9;i++){
      System.out.printf("%d * %d = %d",N,i,N*i);
      System.out.println();
    }

  }
}