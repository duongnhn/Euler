
public class p9_Special_Pythagorean_triplet {
	
	public int prod()
	{
		int sum = 1000;
		int a,b,c;	
		for (c=300;c<=800;c++)
			for (a=10;a<=330;a++)
			{
				b = 1000-c-a;
				if (a*a+b*b-c*c==0)
				{
					System.out.println(a+" "+b+" "+c);
					return (a*b*c);
				}
			}
		return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		p9_Special_Pythagorean_triplet test = new p9_Special_Pythagorean_triplet();
		System.out.println(test.prod());
	}

}
