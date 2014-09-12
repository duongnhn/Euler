
public class P26ReciprocalCycles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int i=2;i<1000;i++)
			if (GCD(i, 10) == 1)
			{
				int val = CycleLength(i);
				if (val > max){
					max = val;
					System.out.println(i + " " + max);
				}
			}
	}

	public static int CycleLength(int n)
	{
		int m = 0;
		int val = 1;
		while (true)
		{
			m++;
			val = (val*10)%n;
			if (val == 1) break;
		}
		return m;
	}
	
	public static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }
}
