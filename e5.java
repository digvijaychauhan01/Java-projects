import java.util.Scanner;
import java.lang.String;

public class e5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //scanner class in java
		System.out.println("enter a string : ");
		char[] letters = input.nextLine().toCharArray();
		System.out.println("Reverse String is : ");
		for(int i=letters.length-1;i>=0;i--)
		{
			System.out.print(letters[i]);
		}
	}
}