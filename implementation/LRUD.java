package implementation;
import java.util.*;

/*
1. N*N
2. 출발(1,1) -> 이동(LRUD) -> 도착(x,y)
3. 예외 명령은 무시
*/

public class LRUD{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //sc.nextLine();
    String[] plan= sc.next().split(" "); 
    //String[] planArr = plan.split(" ");
    int x = 1;
    int y = 1;
    for(int i = 0 ; i<plan.length; i++){
      switch(plan[i]){           
        case "L" : 
          if(x>1 | x<=n)    
          x+=-1;
              break;
        case "R" : 
          if(x>=1 | x<n)
          x+=1;
              break;
        case "U" : 
          if(y>1 | y <=n)
          y+=-1;
              break;
        case "D" : 
          if(y>=1 | y<n)
          y+=1;
              break;
        default : 
              break;
      }
    }

    System.out.println((x+1)+" "+(y+1));   
  }
}