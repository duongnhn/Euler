
public class P30DigitFifthPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int a = 0;a <= 9; a++)
			for (int b = 0;b <= 9;b++)
				for (int c = 0;c <= 9; c++)
					for (int d = 0;d <= 9; d++)
						for (int e = 0;e <= 9; e++)
							for (int g = 0;g <= 9; g++)
						{
							String str1 = "" + a + b + c + d + e + g;
							while (str1.charAt(0)=='0')
							{								
								str1 = str1.substring(1);
								if (str1.length() == 2) break;
							}
							//int val = Integer.parseInt(str);
							int val = (int) (Math.pow(a, 5) + Math.pow(b,5) + Math.pow(c, 5) + Math.pow(d,5) + Math.pow(e, 5) + Math.pow(g, 5));
							String str2 = "" + val;
							if (str1.equals(str2))
							{
								sum = sum + val;
								System.out.println("" + val);
							}
						}
		System.out.println("" + sum);
	}

}
