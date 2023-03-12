import java.util.*;
public class Kmp
{
    
     public static void kmpSearch(String txt,String pat){
         int m = txt.length();
         int n = pat.length();
         
         int[] lps = new int[n];
         fillLps(pat,lps);
         
         int i = 0, j = 0;
         while(i < m){
             if(txt.charAt(i) == pat.charAt(j)){
                 i++;
                 j++;
             }
             if(j == n){
                 System.out.print(i-j+" ");
                 j = lps[j-1];
             }else if(i<m && pat.charAt(j) != txt.charAt(i)){
                 if(j == 0){
                     i++;
                 }else{
                     j = lps[j-1];
                 }
             }
         }
     }
     
     public static void fillLps(String str,int[] lps){
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < str.length()){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }else{
                    len = lps[len-1];
                }
            }
        }
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Text : ");
		String txt = scan.nextLine();
		System.out.println("Enter The Pattern To Search : ");
		String pat = scan.next();
		System.out.print(pat+" Found At : ");
		kmpSearch(txt,pat);
	}
}