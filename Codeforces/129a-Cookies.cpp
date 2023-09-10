#include <bits/stdc++.h>
#define ll long long
using namespace std;

int main(){
  int n;
  cin >> n;
  int a[n];
  for(int i=0; i<n; i++) cin >> a[i];
  int odd = 0 , even =0;

  for(int i=0;i <n ;i++){
    if(a[i]&1) odd++;
    else even++;
  }
  if(!(odd&1)) cout << even << endl;
  else cout << odd << endl;
}
