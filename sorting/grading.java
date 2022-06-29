import java.util.*;


public class grading{


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    String[] name = new String[n];
    int[] score = new int[n];
    
    
    for(int i=0; i<n ; i++){
      name[i] = sc.next();
      score[i] = sc.nextInt();
      sc.nextLine();      
    }

    for(int i=1; i<n ; i++){
      int j = i;
      while(score[j-1]>=score[j]){
        int tmp = score[j-1];
        String str = name[j-1];
        score[j-1] = score[j];
        name[j-1] = name[j];
        score[j] = tmp;
        name[j] = str;
        j--;
        if(j<1) break;
      }
    }    

    String result = String.join(" ",name);
    System.out.println(result);

    
    
  }
}