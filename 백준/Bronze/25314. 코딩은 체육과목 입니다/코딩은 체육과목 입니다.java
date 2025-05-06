import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result="";
        for(int i=0;i<(n/4);i++){
            result+="long ";
        }
        result+="int";
        System.out.println(result);
    }
}