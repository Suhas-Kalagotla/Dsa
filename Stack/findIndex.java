import java.util.*;

class findIndex{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    int n = a.length();
    Stack<Integer> s = new Stack<Integer>();
    int index = sc.nextInt();
    for(int i=0;i <n; i++){
      if(a.charAt(i)=='['){
        s.push(i);
      }
      else if(a.charAt(i)==']'){
        int x = s.peek();
        if(a.charAt(x)=='[' && x==index){
          System.out.println(i);
          return ;
        }
        s.pop();
      }
    }
    System.out.println(-1);
  }
}
