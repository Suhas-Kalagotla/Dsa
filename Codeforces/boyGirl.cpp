#include <bits/stdc++.h>
#define ll long long
using namespace std;


int main(){
  string a;
  cin >> a;
  set<char> l;
  for(int i=0; i<a.length(); i++){
    l.insert(a[i]);
  }
  if(l.size()%2==0){
    cout << "CHAT WITH HER!"<< endl;
  }else{
    cout << "IGNORE HIM!\n";
  }
}
