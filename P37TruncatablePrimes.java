
public class P37TruncatablePrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long max = 1000000;
		int count = 0;
		long sum = 0;
		for (int n=13;n<=max;n++)
		{
			if (!IsTruncatablePrimes(n)) continue;
			count++;
			System.out.println(count + " " + n);
			sum += n;
		}
		System.out.println("" + sum);
	}
	
	public static Boolean IsTruncatablePrimes(long n)
	{
		if (!IsPrime(n)) return false;		
		String str = "" + n;
		while (str.length() > 1)
		{
			str = str.substring(1);
			long val = Long.parseLong(str);
			if (!IsPrime(val)) return false;		
		}
		str = "" + n;
		while (str.length() > 1)
		{
			str = str.substring(0, str.length()-1);
			long val = Long.parseLong(str);
			if (!IsPrime(val)) return false;		
		}		
		return true;
	}

	public static Boolean IsPrime(long n)
	{
		if (n == 1) return false;
		for (long i=2;i <= Math.round(Math.sqrt(n));i++)
			if (n%i == 0)
				return false;
		return true;
	}
}
