import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        for(int i=0;i<num;i++){
            int sum = 0;
            int a=input.nextInt();
            int b = input.nextInt();
            sum = a+b;
            System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+sum);        }
    }
}