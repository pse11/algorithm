import java.io.*;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Map<String, Double> grade = new HashMap<String,Double>();
    grade.put("A+",4.5);
    grade.put("A0",4.0);
    grade.put("B+",3.5);
    grade.put("B0",3.0);
    grade.put("C+",2.5);
    grade.put("C0",2.0);
    grade.put("D+",1.5);
    grade.put("D0",1.0);
    grade.put("F",0.0);
    double sum1 = 0.0; //전공과목별 합
    double sum2 = 0.0; //학점 총합
    for(int i=0;i<20;i++){
      String[] str = br.readLine().split(" ");
      if(!str[2].equals("P")){
        sum1+=(Double.parseDouble(str[1])*grade.get(str[2]));
        sum2+=(Double.parseDouble(str[1]));
      }
    }
    bw.write(sum1/sum2+"");
    bw.close();
    
  }
}