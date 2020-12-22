import java.util.Scanner;
import java.lang.String;

public class GCD{
	static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}

	static int findGCD(int arr[], int n)
	{
		int result =0;
		for(int element: arr){
			result = gcd(result, element);
			if(result==1)
			{
				return 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(findGCD(arr,n));
	}
}