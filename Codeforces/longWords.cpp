#include <bits/stdc++.h>
using namespace std;

void solve(){
  string s1;
  cin >> s1;
  int k = s1.length();
  if(k>10){
  cout << s1[0];
  cout << s1.length()-2 ;
  cout << s1[k-1]<< endl;
}else{
  cout << s1 << endl;
}
}

int main(){
  int tc;
  cin >> tc;
  while(tc--) solve();
}
