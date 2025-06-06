import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();
    int count =0;
    //문자열을 한글자씩 탐색하면서 c,d,l,n,s,z를 만나면 그 뒤의 인덱스까지 탐색하면서 갯수 추가
    for(int i=0;i<input.length();i++){
      char ch = input.charAt(i);
      count++;
      if(ch=='c'){
        //c가 마지막 인덱스에 위치에 있으면 i+1에서 인덱스에러가 나기때문에 
        //c가 마지막 인덱스 이전에 위치해있는 경우에 탐색한다.
        if(i<input.length()-1){
          if(input.charAt(i+1)=='='||input.charAt(i+1)=='-'){
            i++;
          }
        }
      }else if(ch=='d'){
        if(i<input.length()-1){
          if(input.charAt(i+1)=='z'){
            if(i<input.length()-2){
              if(input.charAt(i+2)=='='){
                i+=2;
              }
            }
          }else if(input.charAt(i+1)=='-'){
              i++;
          }
        }
      }else if(ch=='l'){
        if(i<input.length()-1){
          if(input.charAt(i+1)=='j'){
            i++;
          }
        }
      }else if(ch=='n'){
        if(i<input.length()-1){
          if(input.charAt(i+1)=='j'){
            i++;
          }
        }
      }else if(ch=='s'){
        if(i<input.length()-1){
          if(input.charAt(i+1)=='='){
            i++;
          }
        }
      }else if(ch=='z'){
        if(i<input.length()-1){
          if(input.charAt(i+1)=='='){
            i++;
          }
        }
      }
    }
    bw.write(count+"");
    bw.close();
  }
}