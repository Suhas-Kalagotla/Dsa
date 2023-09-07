#include<bits/stdc++.h>
using namespace std;
int t,n;
int main(){
	cin>>t;
	while(t--){
		long long cnt=0,sum=0;
		cin>>n;
		for(int i=1,x;i<=n;i++){
			cin>>x,sum+=x;
			if(x==1)	cnt++;
		}
		if(sum>=cnt+n&&n>1)	cout<<"YES\n";
		else	cout<<"NO\n";
	}
}
