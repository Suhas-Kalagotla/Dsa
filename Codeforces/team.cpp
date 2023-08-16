#include <bits/stdc++.h>
#define ll long long
using namespace std;


int main(){
  ll tc;
  cin >> tc;
  int ans =0;
  while(tc--) {
    int n =3;
    int sum=0;
    for(int i=0; i<n; i++) {
      int l ;
      cin >> l;
      sum += l;
    }
    if(sum>=2) ans++;
  }
  cout << ans << endl;
}
