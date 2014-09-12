import java.util.HashMap;
import java.util.Iterator;


public class P23NonabundantSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> abundantMap = new HashMap<Integer, Integer>();
		int max = 28123;
		int min = 12;
		for (int i=min; i<= max; i++)
			if (IsAbundant(i))
				abundantMap.put(i, 1);
		
		long sum = 0;
		for (int i=1; i <= max; i++)
		{
			//if (abundantMap.containsKey(i)) continue;
			Iterator<Integer> keySetIterator = abundantMap.keySet().iterator();
			Boolean contFlag = false;
			while(keySetIterator.hasNext()){
			  Integer key = keySetIterator.next();
			  Integer val = i-key;
			  if (abundantMap.containsKey(val))
			  {
			  	contFlag = true;
			  	break; 
			  }
			}
			if (contFlag) continue;
			sum = sum + i;
		}
		System.out.println("" + sum);
	}
	
	public static Boolean IsAbundant(int n)
	{
		int sum = 0;
		for (int i=1;i<n;i++)
			if (n%i==0)
				sum = sum + i;
		if (sum > n) return true;
		else return false;
	}

}
