#include <bits/stdc++.h>
using namespace std;


int main(){
  string a,s;
  cin >> a>> s;
  int f = 0 ;
  for(int i=0; i<a.length(); i++){
    if(toupper(a[i]) == toupper(s[i]))
      f=0;
    else if(toupper(a[i]) > toupper(s[i])) {
      f=1;
      break;
    }
    else {
      f=-1;
      break;
    }
  }
  if(f==0){
    cout << f << endl;
  }else if (f==1){
    cout << f << endl;
  }
  else if(f==-1){
    cout << f << endl;
  }
}
