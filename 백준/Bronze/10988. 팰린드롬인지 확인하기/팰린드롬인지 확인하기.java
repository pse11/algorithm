import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split("");
    String[] str2 = new String[str.length];
    for(int i=0;i<str.length;i++){
      str2[i]=str[str.length-i-1];
    }
    String newstr = String.join("",str);
    String  newstr2= String.join("",str2);
    if(newstr.equals(newstr2)){
      System.out.println(1);
    }else{
      System.out.println(0);
    }
    
  }
}