import java.io.*;
import java.util.StringTokenizer;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    //분모와 분자의 최대공약수로 각각 나누면 기약분수가 된다.
    int[] X = new int[2]; //분수 X (X[0]: 분자, X[1]: 분모)
    int[] Y = new int[2]; //분수 Y
    StringTokenizer st = new StringTokenizer(br.readLine());
    X[0]=Integer.parseInt(st.nextToken());
    X[1]=Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    Y[0]=Integer.parseInt(st.nextToken());
    Y[1]=Integer.parseInt(st.nextToken());

    //두개 분수 합하기
    int A = X[0]*Y[1]+Y[0]*X[1];//분자
    int B = X[1]*Y[1]; //분모

    //위 분자(A), 분모(B)의 최대 공약수 구하기
    int gcd = GCD(A,B);

    System.out.println(A/gcd+" "+B/gcd);
  }

  //최대공약수 구하는 메소드(유클리드 호제법)
  public static int GCD(int A, int B){
    if(B==0) return A;
    return GCD(B,A%B);
  }
}