import java.util.Scanner;
import java.lang.String;

public class e6{
	public static void main(String[] args) {
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}
	public static void count(String x)
	{
		char[] ch = x.toCharArray();
		int letter = 0;
		int space =0;
		int num =0;
		int other=0;
		for(int i=0;i<x.length();i++)
		{
			if(Character.isLetter(ch[i])){
				letter++;
			}
			else if(Character.isDigit(ch[i])){
				num++;
			}
			else if(Character.isSpaceChar(ch[i])){
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("String is : " + x);
		System.out.println("letters : " + letter);
		System.out.println("numbers : " + num);
		System.out.println("spaces : " + space);
		System.out.println("others : " + other);
	}
}