import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] arr = new int[2*N];
      if(N==1){
        System.out.println(0);
      }else{
        for(int i=0;i<2*N;i++){
          arr[i]=sc.nextInt();
        }
        int x_min=arr[0];
        int x_max=arr[0];
        int y_min=arr[0];
        int y_max=arr[0];
        for(int i=0;i<arr.length;i+=2){ //x좌표 최대,최소값 비교
          if(x_min>arr[i]){
            x_min=arr[i];
          }
          if(x_max<arr[i]){
            x_max=arr[i];
          }
          if(y_min>arr[i+1]){
            y_min=arr[i+1];
          }
          if (y_max<arr[i+1]) {
            y_max=arr[i+1]; 
          }
        }
        System.out.println((x_max-x_min)*(y_max-y_min));
      }
    }
}