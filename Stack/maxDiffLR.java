import java.util.*;
class maxDiffLR{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i <n; i++) {
      a[i] = sc.nextInt();
    }
    Stack<Integer> s = new Stack<Integer>();

    int l[]= new int[n];
    int r[]= new int[n];

    for(int i=0;i < n; i++){
        while(s.size()!=0 && a[i] < a[s.peek()]){
          int k = s.peek();
          r[k] = a[i];
          s.pop();
        }
        s.push(i);
      }
    while(!s.empty()){
      int i = s.peek();
      r[i] = 0 ;
      s.pop();
    }
    for(int i=n-1; i>=0 ; i--){
        while(!(s.empty()) && a[i] < a[s.peek()]){
          int k = s.peek();
          l[k] = a[i];
          s.pop();
        }
        s.push(i);
      }
    while(!s.empty()){
      int i = s.peek();
      l[i] = 0 ;
      s.pop();
    }
    int ans=-1;
    for(int i=0; i<n; i++){
      int k = Math.abs(l[i] - r[i]);
      ans = k > ans ? k : ans ;
    }
    System.out.println(ans); 
  }
}
