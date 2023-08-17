#include <bits/stdc++.h>
#define ll long long
using namespace std;

int main(){
  ll n;
  cin >> n;
  ll a[n];
  for(int i=0; i<n; i++) cin >> a[i];
  ll max =a[0],ans=0;
  for(int i=1; i<n; i++){
    if(a[i]<=max){
      ans += max - a[i];
    }else{
      max = a[i];
    }
  }
  cout << ans  << endl;
}
