import java.util.Scanner;

class calc
{
	int i;
	int j;
	int result;

	public void perform()
	{
		result = i+j;
	}
}

public class myclass
{
	public static void main(String[] args) {
		calc obj = new calc();
		obj.i = 5;
		obj.j= 10;

		obj.perform();
        System.out.println(obj.result);
	}
}