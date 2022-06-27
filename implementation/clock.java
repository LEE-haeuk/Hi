package implementation;
import java.util.*;
/*
1. 00시 00분 00초 ~ N시 59분 59초 중 3포함 시 카운트
*/

public class clock{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;
    for(int h=0; h<=n ; h++){
      for(int m=0;m<60;m++){
        for(int s=0; s<60;s++){
          String str = "";
          str += h+""+m+""+s;
          
          if(str.contains("3")){
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
}
}