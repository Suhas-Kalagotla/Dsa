#include <bits/stdc++.h>
using namespace std;

void solve(){
  string a;
  cin >> a;
  int n = a.length();
  if(a=="()") {
    cout << "NO\n";
    return ;
  }else{
    cout << "YES\n";
  int l=0, r=0;
  int f=0;
  for(int i=0; i<n; i++){
    if(a[i]=='(') l++ ;
  }

  for(int i=0; i<n-1; i++){
    if(a[i]=='('&& a[i+1]=='(') {
      f=1;
      break;
    }else if(a[i]==')'&& a[i+1]==')'){  
      f=1;
      break;
    }
  }

  string ans="";
  if(f){
    for(int i=0; i<n; i++){
      ans+="(";
      ans+=")";
    }
  }else{
    for(int i=0; i<n; i++){
      ans+="(";
    }
    for(int i=0; i<n;i++){
      ans+=")";
    }
  }
  cout << ans << endl;
}
}

int main(){
  int tc;
  cin >> tc;
  while(tc--) solve();
}
