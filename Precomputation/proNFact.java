//Queries for the product of first N factorials
import java.util.*; 

public class proNFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int m = 1000000007; 
        int n = 1000001; 
        long fact[] = new long[n]; 
        long pro[] = new long[n]; 
        pro[0] = 1; 
        fact[0] = 1 ; 
        for(int i=1; i<n; i++) {
            fact[i] = ((fact[i-1]%m) * i)%m ; 
            pro[i] = ((pro[i-1]%m) * (fact[i]%m))%m;  
        }
        int tc = sc.nextInt(); 
        while(tc-->0 ) {
            int a = sc.nextInt(); 
            System.out.println(pro[a]);
        }
    }
}


