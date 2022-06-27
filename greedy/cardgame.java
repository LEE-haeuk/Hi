package greedy;
import java.util.*;

/*
1. N행 M열
2. 각 행 내 minimum 중 maximum인 행 선택
*/
public class cardgame{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] arr = new int[N][M];
    for(int raw=0;raw<N;raw++){
      for(int col=0;col<M;col++){
        arr[raw][col] = sc.nextInt();
      }
    }

    for(int i = 0 ; i < N ; i++){
      Arrays.sort(arr[i]);
    }
    //Arrays.sort(arr); -> error
    //System.out.println(Arrays.deepToString(arr));
    int sel=arr[0][0];
    
    for(int i = 1 ; i < N ; i++){
      if(sel<arr[i][0]){
        sel = arr[i][0];
        
      }
    }
    System.out.println(sel);
    
    
  }
}