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
        while(!st.empty() && a[st.peek()] < a[i]){
        int val = st.peek();
        greater[val] = i;
        st.pop();
        }
        st.push(i);
    }
    while(!st.empty()){
      int val = st.peek();
      greater[val]  = -1;
      st.pop();
    }

    for(int i=0;i <n; i++){
      while(!st.empty() && a[st.peek()]>a[i]){
        int val = st.peek();
        smaller[val] = i;
        st.pop();
      }
      st.push(i);
    }
    while(!st.empty()){
      int val = st.peek();
      smaller[val] = -1;
      st.pop();
    }

     for(int i=0;i <n; i++){
       if(greater[i]==-1 || smaller[greater[i]]==-1){
         System.out.print(-1 + " ");
       }else{
         System.out.print(a[smaller[greater[i]]]+" ");
       }
     }


  }
}
