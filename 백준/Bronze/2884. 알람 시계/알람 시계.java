import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int M = input.nextInt();
        
        if(M<45){
            H-=1;
            M=60+M-45;
            if(H<0){
                H=23;
            }
        }else{
            M=M-45;
        }
        
        System.out.println(H+" "+M);
        
    }
}
