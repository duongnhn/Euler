
public class P34DigitFactorials {

	public static int[] factorial = new int[10];
	
	public void Init()
	{
		factorial[0] = 1;
		for (int i=1;i< 10; i++)
		{
			factorial[i] = factorial[i-1]*i;
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long max = 1000000;
		P34DigitFactorials rv = new P34DigitFactorials();
		rv.Init();
		long sum = 0;
		for (long n=10;n <= max;n++)
		{
			if (n != SumFactorial(n)) continue;
			sum += n;
			System.out.println("" + n);
		}
		System.out.println("" + sum);		
	}
	
	public static long SumFactorial(long n)
	{
		long sum = 0;
		long x = n;
		while (x > 0)
		{
			int mod = (int)x%10;
			x = x/10;
			sum += factorial[mod];
		}
		return sum;
	}

}
