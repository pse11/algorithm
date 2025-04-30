import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int M = input.nextInt();
        int t = input.nextInt();
        
        int min = H*60+M+t;
        
        H=min/60;
        M=min%60;
        
        if(H>=24){
            H-=24;
        }
        
        
        System.out.println(H+" "+M);
    }
}