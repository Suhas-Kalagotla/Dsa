#include <bits/stdc++.h>
#define ll long long
using namespace std;

int main(){
  ll n;
  cin >> n;
  while(n>0){
    cout << n << " ";
    if(n==1){
      break;
    }
    if(n&1){
      n*=3 ;
      n++;
    }else{
      n/=2;
    }
  }
}
