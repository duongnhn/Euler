import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;


public class P92SquareDigitChains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 1);
		hm.put(89, 89);
		int count = 0;
		int max = 10000000;
		for (int n=1;n < max;n++)
		{
			int val;
			if (!hm.containsKey(n))
			{
				int x = n;
				ArrayList<Integer> arrayList = new ArrayList<Integer>();				
				while (!hm.containsKey(x))
				{
					arrayList.add(x);
					x = SquareDigit(x);				
				}
				val = hm.get(x);
		    Enumeration<Integer> e = Collections.enumeration(arrayList);		    
		    //enumerate through the ArrayList elements
		    while(e.hasMoreElements())
		      hm.put((Integer) e.nextElement(), val);
		  }				
			val = hm.get(n);
			if (val == 89)
			{
				count++;
				System.out.println(count + " "+ n);
			}
		}
	}
	
	public static int SquareDigit(int n)
	{
		int sum = 0;
		while (n > 0)
		{
			int mod = n%10;
			sum += mod*mod;
			n = n/10;
		}
		return sum;
	}
}
