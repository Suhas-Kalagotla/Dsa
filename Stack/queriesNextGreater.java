import java.util.*;

class queriesNextGreater{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    int n1 = sc.nextInt();
    int q[] = new int[n1];
    for(int i=0; i<n1; i++){
      q[i] = sc.nextInt();
    }
    int rightG[] = new int[n];
    Stack <Integer>s = new Stack<>();
    for(int i=0; i<n; i++){
      while(!s.empty() && a[s.peek()] < a[i]){
        int v = s.peek();
        s.pop();
        rightG[v] = a[i] ;
      }
      s.push(i);
    }
    while(!s.empty()){
      int v = s.peek();
      rightG[v] = -1 ;
      s.pop();
    }
    for(int i=0; i<n1; i++){
      System.out.print(rightG[q[i]]+" ");
    }
  }
}
