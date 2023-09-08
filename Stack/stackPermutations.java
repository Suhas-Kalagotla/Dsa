import java.util.*;

class StackPermutations{
  static Boolean isTrue(int in[],int o[],int n){
    Stack<Integer> s = new Stack<Integer>();

    int j=0;

    for(int i=0;i <n ;i++){
      s.push(in[i]);
      while(!s.isEmpty() && s.peek()==o[j]){
        s.pop();
        j++;
      }
    }
    if(s.isEmpty()) return true ;
    else return false;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int in[] = new int[n];
    int o[] = new int[n];
    for(int i=0;i <n ;i++){
      in[i] = sc.nextInt();
    }
    for(int i=0; i<n ;i++){
      o[i] = sc.nextInt();
    }
    if(isTrue(in,o,n)){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
