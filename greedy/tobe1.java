package greedy;
import java.util.*;
/*
1. N-1
2. N%K==0 -> N/K
3. is 1 ?
*/

public class tobe1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int cnt = 0;
    boolean isOne = false;
    while(!isOne){
      if(n==1){
        isOne = true;
      }
      if(n%k==0){
        n/=k;
      }
      else{
        n-=1;
      }
      
      cnt++;
    }
    System.out.println(cnt-1);
    
  }
}