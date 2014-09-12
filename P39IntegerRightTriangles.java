
public class P39IntegerRightTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int p = 120;p <= 1000;p++)
		{
			int sum = 0;
			for (int c = (int)p/2;c >= (int)p/3;c--)
				for (int b = (c-1);b >= (int)(p-c)/2;b--)
				{
					int a = p - c - b;
					if (a*a+b*b==c*c) sum++;
				}
			if (sum > max)
			{
				max = sum;
				System.out.println(" " + p + " " + max);
			}
		}
	}

}
