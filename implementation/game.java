package implementation;
import java.util.*;
/*
1. N * M
2. pos , direc
3. direc 왼쪽방향부터
4. 가봄 or 갈 수 없는 곳 -> 방향유지 + 뒤로 1칸
*/
public class game{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int d = sc.nextInt();
      int[] compassX = {0,-1,0,1};
      int[] compassY = {-1,0,1,0};
      int visit=1;
      //d -> 0:north, 1:east, 2:south, 3:west
  
      //get map
      int[][] arr = new int[n][m];
      for(int i = 0 ; i<n;i++){
        for(int j = 0 ; j<m; j++){
          arr[i][j] = sc.nextInt();
          
        }
      }
      
      //arr=0 -> 감. arr=1 -> 못 감. arr=2 -> 가봄.
      arr[x][y]=2;
      int cnt = 0;
      while(true){
        //end condition
        if(cnt==4){
          int nd = (d+2)%4;
          x += compassX[nd];
          y += compassY[nd];
          if(arr[x][y]==1){
            break;
          }
          cnt=0;
          continue;
        }
  
        //basic check
        int nd =(d+1)%4;
        int nx = x + compassX[nd];
        int ny = y + compassY[nd];
        if(arr[nx][ny]!=0){
          d = nd;
          cnt++;
          continue;
        }
        //update current status
        x = nx;
        y = ny;
        d = nd;
        arr[x][y] = 2;
        visit++;
      }
    
    
    System.out.println(visit);            
  
  }
}