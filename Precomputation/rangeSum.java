// Range sum queries without updates
import java.util.*; 

public class rangeSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int m = 1000000007; 
        int tc = sc.nextInt(); 
        while(tc-->0 ) {
            int n = sc.nextInt(); 
            int a[] = new int[n]; 
            for(int i=0;i <n; i++) a[i] = sc.nextInt(); 

            int sum[]= new int[n]; 
            sum[0]= a[0]; 
            for(int i=1;i<n; i++){
                sum[i] = sum[i-1] + a[i] ; 
            }
            int q  = sc.nextInt(); 
            while(q-->0){
                int k = sc.nextInt(); 
                System.out.println(sum[k]);
            }
        }
    }
}
