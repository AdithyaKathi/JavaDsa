import java.util.*;
public class NumSubSequences
{
    public static void printSubsequences(List<Integer> list, int ind , int[] arr , int n){
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
		List<Integer> list = new ArrayList<Integer>();
		int[] arr = {8,9,8,7,3,2,2,9,0,7};
		printSubsequences(list,0,arr,arr.length);
	}
}