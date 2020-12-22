import java.util.Scanner;

 public class e4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		long number = input.nextLong();
		System.out.println("The sum is : " + theSum(number));

	}
	public static int theSum(long n){
	int sum = 0 ;
	while(number != 0)
	{
		sum += number%10;
		number /= 10;
	}
	return sum;
}
}