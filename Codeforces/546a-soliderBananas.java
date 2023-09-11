import java.util.*;

class Solution {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    int total =0;
    for(int i=0; i<n; i++){
      total += i*k;
    }
    total -= n;
    System.out.println(total); 
  }
}
