
public class P33DigitCancelingFractions {

	public static void main(String[] args) {
		for (int a = 10;a <= 99; a++)
			for (int b = a+1;b <= 99; b++)
			{
				int c = a%10;
				int d = (int) b/10;
				int e = (int) a/10;
				int f = b%10;
				if ((c != d)&&(e != f)) continue;
				if (a*d==c*b) System.out.println(a + "/" + b + " = " + c + "/" + d);
				else if (a*f==e*b) System.out.println(a + "/" + b + " = " + e + "/" + f);				
			}
	}
}
