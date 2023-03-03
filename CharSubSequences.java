import java.util.*;
public class CharSubSequences
{
    public static void printSubsequences(List<Character> list, int ind , char[] arr , int n){
        if(ind >= n){
            System.out.print(list+" ");
            return;
        }
        
        list.add(arr[ind]);
        printSubsequences(list,ind+1,arr,n);
        list.remove(list.size()-1);
        printSubsequences(list,ind+1,arr,n);
    }
	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		char[] arr = {'A','D','I','T','H','Y','A'};
		printSubsequences(list,0,arr,arr.length);
	}
}