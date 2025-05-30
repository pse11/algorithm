import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum =0;
    String[] Y = sc.next().split("");

    for(int i=0;i<N;i++){
      sum+=Integer.parseInt(Y[i]);
    }
    System.out.println(sum);
  }
}