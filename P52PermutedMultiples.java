import java.util.Arrays;


public class P52PermutedMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 100000;
		while (!IsValid(x))
		{
			x++;
			System.out.println("" + x);
		}
	}

	public static Boolean IsValid(long n)
	{
		String str = Long.toString(n);
		str = Sort(str);
		if (!str.startsWith("1")) return false;
		for (int i=2;i<=6;i++)
		{
			String newStr = Long.toString(n*i);			
			if (!str.equalsIgnoreCase(Sort(newStr))) return false;
		}
		
		return true;
	}
	
	
	public static String Sort(String original)
	{
    char[] chars = original.toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
		return sorted;
	}
}
