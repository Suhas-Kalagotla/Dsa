import java.util.*;

public class RectArea{
  static int MaxArea(int a[],int n){
    Stack<Integer> s = new Stack<>();

    int max_area = 0 ;
    int tp ;
    int area ;

    int i=0 ;
    while(i < n ){
      if(s.empty() || a[s.peek()] <= a[i]){
        s.push(i++);
      }else{
        tp = s.peek();
        s.pop();

        area = a[tp] * (s.empty() ? i : i - s.peek()-1);
        max_area = max_area < area ? area : max_area ;
      }
    }
    while(s.empty()==false){
      tp = s.peek();
      s.pop();
      area = a[tp] * (s.empty() ? i : i - s.peek()-1);
      max_area = max_area < area ? area : max_area ;
    }
    return max_area;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() ;
    int a[] = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Max area : "+ MaxArea(a,n));
  }
}
