import java.util.*;

class conDelete{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] words = s.split("\\s");

    int n = words.length;
    Stack<Integer> st = new Stack<Integer>();
    for(int i=0; i<n; i++){
      if(st.empty()){
        st.push(i);
      }else if(words[st.peek()].equals(words[i])){
        st.pop();
      }else{
        st.push(i);
      }
    }
    System.out.println(st.size());
  }
}
