import java.util.*;

class RemoveBrackets{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();
    char res[] = new char[n];
    int index =0,i=0;

    Stack<Integer> s = new Stack<>();
    s.push(0);

    while(i<n){
      if(str.charAt(i)=='('&&i==0){
        i++;
        continue;
      }
      if(str.charAt(i)=='+'){
        if(s.peek()==1)
          res[index++] = '-';
        if(s.peek()==0)
          res[index++] ='+';
      }else if(str.charAt(i)=='-'){
        if(s.peek()==1)
          res[index++]='+';
        else if(s.peek()==0)
          res[index++]='-';
      }else if(str.charAt(i)=='(' && i>0){
        if(str.charAt(i-1)=='-'){
          int x = (s.peek()==1) ? 0:1 ;
          s.push(x);
        }
        else if(str.charAt(i-1)=='+')
          s.push(s.peek());

      }
      else if(str.charAt(i)==')')
        s.pop();
      else if(str.charAt(i)=='('&& i==0)
        i = 0;
      else
        res[index++] = str.charAt(i);
      i++ ;
    }
    System.out.println(new String(res));
  }
}
