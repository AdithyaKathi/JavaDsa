import java.util.*;
public class TargettedSubSequences
{
    public static void printS(int ind,List<Integer> list,int s,int sum,int[] arr,int n){
        if(ind == n){
            if(s == sum){
                System.out.print(list+" ");
            }
            return;
        }
        
        list.add(arr[ind]);
        s = s+arr[ind];
        printS(ind+1,list,s,sum,arr,n);
        list.remove(list.size()-1);
        s = s-arr[ind];
        printS(ind+1,list,s,sum,arr,n);
    }
	public static void main(String[] args) {
		int[] arr = {1,2,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Target Sum : ");
		int target = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("All Sub Sequences That Equals Target  =  "+target);
		printS(0,list,0,target,arr,arr.length);
	}
}