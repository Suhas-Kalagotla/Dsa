import java.util.*;

class MaxProduct {
  static int[] leftGreater(int a[], int n){
    int []left= new int[n+1];
    Stack<Integer> s = new Stack<Integer> ();

    for(int i=n-1 ; i>=0; i--){
      while(s.size()!=0 && a[i] > a[s.peek()-1]){
        int r = s.peek();
        s.pop();
        left [r-1] = i+1 ;
      }
      s.push(i+1);
    }
    return left ;
  }

  static int[] rightGreater(int a[],int n){
    int right[] = new int[n];
    Stack<Integer> s= new Stack<Integer>();
    for(int i=0; i<n; i++){
      while(s.size() != 0 && a[i] > a[s.peek()-1]){
        int r = s.peek();
        s.pop();
        right[r-1] = i+1 ;
      }
      s.push(i+1);
    }
    return right;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i <n; i++) {
      a[i] = sc.nextInt();
    }
    int left[] = leftGreater(a,n);
    int right[] = rightGreater(a,n);

    int ans = -1 ;
    for(int i=0 ; i<=n; i++){
      int k = left[i] * right[i];
      if(k > ans) {
        ans = k;
      }
    }
    System.out.println(ans);
  }
}
