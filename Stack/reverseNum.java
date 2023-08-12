import java.util.*;

class reverseNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans =0 ;
    Stack <Integer>s = new Stack<>();
    while(n>0){
      s.push(n%10);
      n/=10;
    }
    int i=1;
    while(!s.empty()){
      ans += s.peek() * i ;
      i *= 10 ;
      s.pop(); 
    }
    System.out.println(ans);
  }
}
