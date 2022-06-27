package greedy;
import java.util.*;

public class bignumlaw {
  public static void main(String[] args){
    /*
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int K = sc.nextInt();
      int[] arr = new int(N);
      for(int i = 0 ; i < N ; i++){
        arr[i] = sc.nextInt();
      }

    */
    
    int N=5;
    int M=8;
    int K=3;
    int arr[] = {2,4,5,4,6};
    int sum=0;
    //총N개수, 총M번합, K번중복
    
    //큰 수 찾기
    Arrays.sort(arr);

    //연산
    //1. [max1+max1+max1+max2] 패턴 찾고 그 개수만큼 sum에 추가
    //2. M번 시행 중 패턴을 제외한 만큼 max1 추가
    sum = K*(M/(K+1))*arr[N-1] + (M/(K+1))*arr[N-2]+(M-4*(M/(K+1)))*arr[N-1];
    //또는 (M-4*(M/(K+1)))*arr[N-1] => (M%(K+1))*arr[N-1]
    
    System.out.println(sum);
  }
}