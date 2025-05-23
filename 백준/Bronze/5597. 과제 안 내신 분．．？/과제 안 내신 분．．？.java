import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        //값을 입력받고 해당 번호의 인덱스에 값이나 카운트를 넣는다. 그리고 최종 비어있는 2개의 인덱스 값을 출력한다.
        for(int i=0;i<28;i++){
            int idx = sc.nextInt();
            arr[idx-1]=1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println(i+1);
            }
        }
    }
}