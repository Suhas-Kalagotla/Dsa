import java.util.*;

class celebrity{

  static boolean knows(int a, int b ,int m[][]){
    boolean res = (m[a][b]==1);
    return res;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m[][] = new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        m[i][j] = sc.nextInt();
      }
    }

    Stack<Integer> s = new Stack<>();
    int c ;
    for(int i=0; i<n; i++){
      s.push(i);
    }

    while(s.size()>1){
      int a = s.pop();
      int b = s.pop();

      if(knows(a,b,m)){
        s.push(b);
      }else{
        s.push(a);
      }
    }
    if(s.empty()){
      System.out.println(-1);
      return ;
    }
    c = s.pop();

    for(int i=0; i<n; i++){
      if(i!=c && (knows(c,i,m)||!knows(i,c,m))){
        System.out.println(-1);
        return ;
      }
    }
    System.out.println(c);
  }
}
