
public class P12HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long value = 28;
		long start = 7;
		while (true)
		{
			start++;
			value += start;
			int numberDivisors = P12HighlyDivisibleTriangularNumber.CountDivisors(value);
			System.out.println("" + value + " " + numberDivisors);
			if (numberDivisors>500) break;
		}
	}
	
	public static int CountDivisors(long n)
	{
		if (n <= 0) return 0;
		int count = 1;
		for (long i=2;i <= n;i++)
			if (n%i == 0)
			{
				count++;
			}
		return count;
	}

}
