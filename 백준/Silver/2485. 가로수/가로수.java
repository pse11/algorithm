import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //가로수 간격들의 최대공약수가 일정한 간격이 된다.
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N]; //가로수 위치 배열
    int[] m = new int[N-1]; //가로수 위치의 간격 배열
    for(int i=0;i<N;i++){
      arr[i]=Integer.parseInt(br.readLine());
    }
    //가로수 위치의 간격
    for(int i=0;i<N-1;i++){
      m[i]=Math.abs(arr[i]-arr[i+1]);
    }
    int a = m[0];
    //각 가로수 간격들의 최대공약수
    for(int i=1;i<m.length;i++){
      a = GCD(a,m[i]);
    }
    //등차수열로 arr[0]과 arr[N-1]사이의 가로수 총 개수를 구하고,
    //원래 있던 가로수 개수를 빼 추가적으로 필요한 가로수 개수를 구한다.
    System.out.println((arr[N-1]-arr[0])/a+1-N);
  }
  //최대공약수 구하는 메소드
  public static int GCD(int A, int B){
    if(B==0) return A;
    return GCD(B,A%B);
  }
}