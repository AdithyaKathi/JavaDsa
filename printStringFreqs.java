import java.util.*;
public class Main
{
    public static void printStringFreqs(String str){
        int[] count = new int[26];
        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)-'a']++; 
        }
        
        for(int i = 0; i<26; i++){
            if(count[i] > 0){
                System.out.println((char)(i+'a')+"-->"+count[i]);
            }
        }
        
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String userInput = scan.nextLine();
		printStringFreqs(userInput);
		
	}
}
