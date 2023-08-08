import java.util.*;

class NGE {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }

    int ans[] = new int[n];
    Stack<Integer> s = new Stack<Integer>();
    int tp ;

    for(int i=0; i<n; i++){
      if(s.empty()){
        s.push(i);
      }
        while(!s.empty() && a[s.peek()] < a[i] ){
          tp = s.peek();
          ans[tp] = a[i];
          s.pop();
        }
        s.push(i);
    }
    while(!s.empty()){
      tp = s.peek();
      ans[tp] = -1 ;
      s.pop();
    }

    for(int i=0; i<n; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
