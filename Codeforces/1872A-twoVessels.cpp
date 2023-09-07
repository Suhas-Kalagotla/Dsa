#include <bits/stdc++.h>
#define ll long long
using namespace std;

void solve(){
  int a ,b , c;
  cin >> a >> b >> c;
  int mid = (a+b) / 2 ;
  int max = a >b ? a : b;
  int val = max - mid ;
  if(val % c ==0){
    cout << val/c << endl;
  }else{
    cout << val/c + 1 << endl;
  }
}

int main(){
  ll tc;
  cin >> tc;
  while(tc--) solve();
}
