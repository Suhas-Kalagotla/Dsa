import java.util.*;

class StockSpan{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int[n];
    int ans[] = new int[n];
    for(int i=0;i <n; i++){
      a[i] = sc.nextInt();
    }
    Stack<Integer> st = new Stack<>();
    st.push(0);
    ans[0] = 1 ;

    for(int i=1; i<n; i++){
      while(!st.isEmpty() && a[st.peek()] <= a[i])
        st.pop();
      ans[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
      st.push(i);
    }

    for(int i=0; i<n; i++) {
      System.out.print(ans[i]+" ");
    }
  }
}
