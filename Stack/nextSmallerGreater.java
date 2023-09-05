import java.util.*;

class NextSmallerGreater{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];

    for(int i =0; i<n; i++) {
      a[i]=sc.nextInt();
    }
    
    System.out.println();
    Stack <Integer> st = new Stack<>();
    int greater[] = new int[n];
    int smaller[] = new int[n];

    for(int i =0 ;i <n; i++){
      if(st.empty() || (a[st.peek()] > a[i])) st.push(i);
      else{
        while(!st.empty() && a[st.peek()] < a[i]){
        int val = st.peek();
        greater[val] = i;
        st.pop();
        }
      }
    }
    while(!st.empty()){
      int val = st.peek();
      greater[val]  = -1;
      st.pop();
    }
    for(int i=0; i<n; i++){
      System.out.print(greater[i] +  " ") ;
    }

  }
}
