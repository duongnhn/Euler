import java.util.Arrays;


public class P38PandigitalMultiples {

	public static String pandigitalStr = "123456789";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10000;
		long result = 0;
		for (int m = 1;m < max;m++)
			for (int n=1;n <= 9;n++)
			{
				//if ((m != 9)||(n!=5)) continue;
				String str = "";
				for (int i=1;i<=n;i++)
				{
					str = str + m*i;
					if (str.length() > 9) break;
				}
				if (IsPandigital(str))
				{
					long val = Long.parseLong(str);
					if (val > result) {
						result = val;
						System.out.println(result + " " + m + " " + n);
					}
				}
			}
	}

	public static Boolean IsPandigital(String original)	
	{
		if (original.length()!= 9) return false;
    char[] chars = original.toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
   	if (!sorted.equals(pandigitalStr)) return false;
   	return true;
	}
}
