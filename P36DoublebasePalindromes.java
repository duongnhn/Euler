
public class P36DoublebasePalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1000000;
		long sum = 0;
		for (int i=1;i < max;i++)
		{
			if (!IsPalindrome(""+i)) continue;
			String iBase2 = Integer.toBinaryString(i);
			if (!IsPalindrome(iBase2)) continue;
			sum += i;
			System.out.println(i + " " + iBase2);
		}
		System.out.println("" + sum);
	}

	public static Boolean IsPalindrome(String str)
	{
		int length = str.length();
		for (int i=0;i <= (int)length/2; i++)
			if (str.charAt(i)!= str.charAt(length-i-1))
				return false;
		return true;
	}
	
}
