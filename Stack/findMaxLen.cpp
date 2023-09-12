#include <bits/stdc++.h>
#define ll long long
using namespace std;

void solve(){
  string s ;
  cin >> s;
  int n= s.length();
  stack<int> st;
  st.push(-1);
  int r = 0 ;

  for(int i=0; i<n; i++){
    if(s[i]=='(') st.push(i);
    else{
      if(!st.empty())
        st.pop();
    if(!st.empty())
      r = i-st.top() > r ? i-st.top() : r;
    else
      st.push(i);
  }
}
  cout << r << endl;
}

int main(){
  ll tc;
  cin >> tc;
  while(tc--) solve();
}
