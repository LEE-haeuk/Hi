package implementation;
import java.util.*;
/*
1. 8*8
2. 체스 나이트 위치에 따른 이동 가능 경로 가짓수
*/
public class knight{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] pos = sc.next().toCharArray();
    int x = pos[0] - 96;
    int y = pos[1] - '0';
    //System.out.println(x+","+y);
    int[] dx = {-2,-2,2,2,-1,1,-1,1};
    int[] dy = {-1,1,-1,1,-2,-2,2,2};
    int cnt = 0;
    for(int i=0;i<8;i++){
      int nx = x + dx[i];
      int ny = y + dy[i];
      if(nx<1 | nx>8 | ny<1 | ny>8 ){
        continue;
      }
      cnt++;
    }
    System.out.println(cnt);
        
  }
}
