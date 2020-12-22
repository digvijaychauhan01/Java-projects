public class e11{
	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.n = 10;
		obj.Perform();

		System.out.println(obj.sum);
	}
}

class Calc
{
	int i;
	int n;
	int sum;
	int a[] = new int[n];

	public void Perform()
	{
	for(i=1;i<n;i++)
	
		{
			sum=sum+i;
		}
  }
}