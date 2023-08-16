#include <bits/stdc++.h>
#define ll long long
using namespace std;

void solve(){
  ll n;
  cin >> n;
  ll ans =0;
  ll min=INT_MAX, smin=INT_MAX;
  for(int i=0; i<n; i++) {
    ll k ;
    cin >> k;
    ll a[k];
    for(ll i=0; i<k; i++){
      cin >> a[i];
    }
    sort(a,a+k);
    ans += a[1];
    min = min > a[0] ? a[0] : min ;
    smin = smin > a[1] ? a[1]:smin;
  }
  cout << ans - smin + min  << endl;
}

int main(){
  ll tc;
  cin >> tc;
  while(tc--) solve();
}
