import java.util.Scanner;
public class Exercise33{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = input.nextLong();
        System.out.println("The sum of digits of number is : " + theSum(n));
    }
    public static int theSum(long n)
    {
        int sum=0;
        while(n!=0){
        sum += n%10;
        n = n/10;
        }
        return sum;
    }
}
