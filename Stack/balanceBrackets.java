import java.util.*;

class balanceBrackets{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    Stack <char> s = new Stack<>();
    for(int i=0; i<a.length(); i++ ){
      char x = a.charAt(i);
      if(x=='('||x=='[' || x=='{'){
        s.push(x);
        continue ;
      }
      if(s.empty())
        return false;
      char check;
      switch(x){
        case ')':
          check = stack.pop();
          if(check == '{' || check=='[')
            return false ;
          break;
        case '}' :
          check = stack.pop();
          if (check == '(' || check == '[')
              return false;
          break;
        case ']':
          check = stack.pop();
          if (check == '(' || check == '{')
              return false;
          break;
      }
    }
    if(s.empty()){
      System.out.println("Balanced");
    }else{
      System.out.println("Not Balanced"); 
    }
  }
}
