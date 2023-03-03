import java.util.*;
public class PatternSearch
{
    public static void naivePatternSearching(String text , String pattern){
        int len_text = text.length();
        int len_pattern = pattern.length();
        for(int i = 0; i<len_text; i++){
            int j;
            for(j = 0; j<len_pattern; j++){
                if(pattern.charAt(j) != text.charAt(i+j)){
                    break;
                }
            }
            if(j == len_pattern){
                System.out.print(i+" ");
            }
        }
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Text : ");
		String text = scan.nextLine();
		System.out.println("Enter The Pattern : ");
		String pattern	= scan.nextLine();
		System.out.print("Pattern Occurs At Index(s) : ");
		naivePatternSearching(text,pattern);
		
	}
}