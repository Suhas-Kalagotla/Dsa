#include <bits/stdc++.h>
using namespace std;
int main(){
  int n,t;
  cin >> n >> t;
  string s ;
  cin >> s;
  while(t--){
    for(int i=0; i<s.length()-1;i++){
      if(s[i]=='B'&& s[i+1]=='G'){
        char temp = s[i];
        s[i]=s[i+1];
        s[i+1] = temp ;
        i++;
      }
    }
  }
  cout << s << endl;
}
