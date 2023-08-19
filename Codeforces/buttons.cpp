#include <bits/stdc++.h>
#define ll long long
using namespace std;

void solve(){
  int n;
  cin >> n;
  int a[n];
  for(int i=0; i<n; i++) cin >> a[i];
  int anna = a[0];
  int katie = a[1];
  int k = a[3]/2;
  anna+= k;
  katie += k;
  anna += k%2 ;

  if(anna < katie){
    cout << "Second\n";
  }else{
    cout << "First\n"; 
  }
}

int main(){
  ll tc;
  cin >> tc;
  while(tc--) solve();
}
