import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int M = 0;
        double sum=0;
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(M<arr[i]){M=arr[i];}
        }
        for(int i=0;i<N;i++){
            //자바에서 정수 연산의 결과는 정수가 되기때문에 형변환해줘야 한다.
            sum+=(double)arr[i]/M*100; 
        }
        System.out.println(sum/N);
    }
}