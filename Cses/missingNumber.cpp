#include <bits/stdc++.h>
#define ll long long
using namespace std;


int main(){
  ll n;
  cin >> n;
  ll a[n];
  for(int i=0;i <n-1;i++){
    cin >> a[i];
  }
  ll sum = 0  ;
  for(int i=0;i <n-1;i++){
    sum+=a[i];
  }
  cout << abs(sum - ((n*(n+1))/2))<<endl;
}
