import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      //대소문자 구분하지 않기 때문에 소문자로 다 변경해준다.
      String str = br.readLine().toLowerCase();
      //알파벳 개수의 배열 선언
      int[] array = new int[26];
      //str의 문자가 아스키코드로 알파벳 확인되면 해당 인덱스에 1추가 (아스키코드 영어 소문자: 97)

      for(int i=0;i<str.length();i++){
        for(int j=0;j<26;j++){
          if(str.charAt(i)==(j+97)){
            array[j]++;
          }
        }
      }
      //max값을 찾고 해당 max값이 있는지 확인하여 count 증가
      int max = array[0];
      int idx = 0;
      int count = 0;
      //max 찾기
      for(int i=0;i<26;i++){
        if(max<array[i]){
          max=array[i];
          idx=i;
        }
      }
      //max값있는지 확인후 count 증가
      for(int i=0;i<26;i++){
        if(array[i]==max){
          count++;
        }
      }
      
      //카운드가 2이상이면 많이 사용된 알파벳이 여러개 존재 -> ? 출력
      if(count==1){
        char result=(char)(idx+65);
        bw.write(result);
      }else if(count>=2){
        bw.write("?");
      }
      bw.close();
  }
}