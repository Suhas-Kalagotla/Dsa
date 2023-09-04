import java.util.*;

class dupParenthesis{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Stack<Character>st = new Stack<>();
    String a = sc.nextLine();
    boolean f=true;
    char[] str = a.toCharArray();
    for(char ch : str){
      if(ch==')'){
        char top = st.peek();
        st.pop();
        int elements = 0  ;
        while(top!='('){
          elements++;
          top = st.peek();
          st.pop();
        }
        if(elements < 1) {
          System.out.println("true");
          f=false;
        }
      }
      else{
        st.push(ch);
      }
    }
    if(f){
    System.out.println("false");
    }
  }
}
