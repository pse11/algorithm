import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    for(int i=97;i<=122;i++){ //영어 소문자 아스키코드
      System.out.print(str.indexOf(i)+" ");
    }
  }
}