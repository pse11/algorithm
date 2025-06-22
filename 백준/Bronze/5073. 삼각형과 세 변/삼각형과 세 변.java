import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      while(true){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = Math.max(Math.max(a,b),c);
        if(a==0&&b==0&&c==0){
          break;
        }
        if(max==a){
          if(max<b+c){
            if(a==b&&b==c){
          bw.write("Equilateral\n");
        }else if(a==b||a==c||b==c){
          bw.write("Isosceles\n");
        }else{
          bw.write("Scalene\n");
        }
          }else{
            bw.write("Invalid\n");
          }
        }else if(max==b){
          if(max<a+c){
            if(a==b&&b==c){
          bw.write("Equilateral\n");
        }else if(a==b||a==c||b==c){
          bw.write("Isosceles\n");
        }else{
          bw.write("Scalene\n");
        }
          }else{
            bw.write("Invalid\n");
          }
        }else if(max==c){
          if(max<b+a){
            if(a==b&&b==c){
          bw.write("Equilateral\n");
        }else if(a==b||a==c||b==c){
          bw.write("Isosceles\n");
        }else{
          bw.write("Scalene\n");
        }
          }else{
            bw.write("Invalid\n");
          }
        }
        
      } 
      bw.close();
  }
}