#include <bits/stdc++.h>
using namespace std;


int main(){
  string a;
  cin >> a;
  int ans =1,max =1;
  for(int i=0; i<a.length()-1; i++){
    if(a[i]==a[i+1]) {
      ans++;
      max = ans > max ? ans : max ;
    }
    else ans =1 ;
  }
  cout << max << endl;
}
