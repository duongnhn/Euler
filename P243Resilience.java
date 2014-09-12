
public class P243Resilience {

	public static double max = (double)15499/94744;
	public static double minSoFar = Double.MAX_VALUE;
	public static int maxA = 1000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[maxA];
		A[1] = 0;
		A[2] = 1;
		A[3] = 2;
		for (int n= 4;n <= maxA; n++)
		{
			Boolean isPrime = true;
			for (int i=2;i <= Math.round(Math.sqrt(n));i++)
			{
				if (n%i == 0)
				{
					A[n] = A[i]*A[(int)n/i];
					isPrime = false;
					break;
				}
			}
			if (isPrime) A[n] = n-1;
		}
/*		long start = 510510;

		while (true)
		{
			start++;
			double val = R(start);
			if (val < minSoFar)
			{
				minSoFar = val;
				System.out.println("" + start + " " + minSoFar + " " + max);
			}
			if (minSoFar<max) break;
		}*/
	}
	
	public static long GCD(long a, long b) { return b==0 ? a : GCD(b, a%b); }
	
	public static double R(long n){
		long sum = 0;
		for (long i=1;i<n;i++)
			if (GCD(i,n)==1) 
				{
					sum++;
					if ((double)sum/n > minSoFar) return minSoFar;
				}
		return (double)sum/n;
	}
}
 