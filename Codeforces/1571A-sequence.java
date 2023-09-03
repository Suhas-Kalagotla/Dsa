import java.util.*;

class Sequence {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for(int j=0; j<n ;j++){
    String s = sc.nextLine();
    Stack<Integer> st = new Stack<>();
    st.push(0);
    char ans = s.charAt(0);
    for(int i=1; i<s.length(); i++){
      if(s.charAt(i)=='=') continue ;
      if(s.charAt(i)==s.charAt(st.peek())){
        st.push(i);
      }else{
        ans = '?';
        break;
      }
    }
    System.out.println(ans);
  }
  }
}
