import java.util.*;

public class p35_Circular_primes {
	
	Hashtable h = new Hashtable();
	
	public int isPrime(int n){
		for (int i=2;i<=Math.sqrt(n);i++)
		{
			if (n%i==0)
			{
				return 0;//not prime
			}
		}
		return 1;//prime
	}
	
	public int check(int n){
		int flag = 0;//not circule prime
		String s = Integer.toString(n);
		int l = s.length();
		int m = n;
		int remainder, quotient;
		for (int rotate=l-1;rotate>0;rotate--)
		{
			remainder = (int) m%10;
			quotient = (int) m/10;
			m = (int) ((int) remainder*Math.pow(10, l-1) + quotient);
			if (!h.containsKey(m))
			{
				return flag;
			}
		}
		flag = 1;
		return flag;		
	}
	
	//int max = 1000000;
	
	public int count(int n){
		for (int i=2;i<=n;i++)
			if (isPrime(i)==1)
			{
				h.put(i,0);
			}
		int counter = 0;
		for (int i=2;i<=n;i++)
			if (h.containsKey(i)&&check(i)==1)
			{
				counter++;
				System.out.print(i+" ");
			}
		return counter;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p35_Circular_primes test = new p35_Circular_primes();
		System.out.println("\n"+test.count(1000000));
	}

}
