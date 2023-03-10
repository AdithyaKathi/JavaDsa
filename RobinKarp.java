import java.util.*;
public class RobinKarp
{
    public static final int d = 5;
    public static final int q = 101;
    public static void RKSearch(String txt , String pat , int m , int n){
        
        int h = 1;
        for(int i = 1; i<=n-1; i++){
            h = (h*d )% q;                // To Compute d^(m-1)
        }
        
        int p = 0, t = 0;
        for(int i = 0; i<n; i++){
            p = ( p*d+pat.charAt(i) ) %q;
            t = ( t*d+txt.charAt(i) ) %q;      // to compute initial hash value of text window and hash value of pattern 
        }
        
        for(int i = 0; i<=m-n; i++){
            if(p == t){
                boolean flag = true;
                for(int j = 0; j<n; j++){
                    if(txt.charAt(i+j) != pat.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                  System.out.print(i+" ");
                }
            }
            
            if(i < m-n){
                t = ( (d*(t - txt.charAt(i)*h))+txt.charAt(i+n) ) %q;
                if(t < 0){
                    t = t+q;
                }
            }
        }
        
        
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Text : ");
		String txt = scan.nextLine();
		System.out.println("Enter The Pattern To Search : ");
		String pat = scan.nextLine();
		
		System.out.print(pat + " Found At : ");
		RKSearch(txt , pat , txt.length() , pat.length());
	}
}