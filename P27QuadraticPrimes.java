
public class P27QuadraticPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if (IsPrime(11)) System.out.println("true");
		int max = 0;
		int aMax = 0; int bMax = 0;
		for (int b=1;b<1000;b++)
		{
			for (int a=-999;a<1000;a++){
				int n = 0;
				while (true)
				{
					int val = n*n + a*n + b;
					if (IsPrime(val))
					{
						n++;
					}
					else
					{
						n--;
						if (n > max)
						{
							max = n;
							aMax = a;
							bMax = b;
						}
						break;
					}
				}
			}
		}
		System.out.println("" + max + " " + aMax + " " + bMax);
	}

	public static Boolean IsPrime(int n){
		if (n <= 1) return false;
		if (n == 2) return true;
		for (int i = 2;i <= (Math.round(Math.sqrt(n))); i++)
			if (n%i == 0)
				return false;		
		return true;
	}
	
}
