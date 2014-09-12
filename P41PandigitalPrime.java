
public class P41PandigitalPrime {

	public static int max = 10;
	public int maxN;
	public Boolean[] Mark = new Boolean[10];
	public long maxPrime = 0;
	
	public void Init(){
		for (int i=1;i<max;i++)
			Mark[i] = true;
	}
	
	public String str = "";
	
	public void Try(int n)
	{
		if (n > maxN)
		{
			long val = Long.parseLong(str);
			if (IsPrime(val)){
				maxPrime = maxPrime<val? val: maxPrime;
				System.out.println(maxPrime + " " + val);
			}
			return;
		}
		for (int i=1;i<=maxN;i++)
			if (Mark[i])
			{
				Mark[i] = false;
				str = str + i;
				Try(n+1);
				Mark[i] = true;
				str = str.substring(0, str.length()-1);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P41PandigitalPrime rv = new P41PandigitalPrime();
		rv.Init();
		for (int i=9;i>0;i--)
		{
			rv.maxN = i;
			rv.Try(1);
			if (rv.maxPrime != 0)
				break;
		}
	}

	public static Boolean IsPrime(long n)
	{
		if (n == 1) return false;
		for (long i=2;i <= Math.round(Math.sqrt(n));i++)
			if (n%i==0)
				return false;
		return true;
	}
	
}
