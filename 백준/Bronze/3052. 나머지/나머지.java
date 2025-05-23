import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        //BufferedReader를 사용하기 위해서는 throws IOExeption을 해주어야함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        int[] arr = new int[10];
        int[] result = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<10;i++){
            result[i] = (arr[i]%42);
        }
        //중복제거
        result = Arrays.stream(result).distinct().toArray();
        System.out.println(result.length);
    }
}