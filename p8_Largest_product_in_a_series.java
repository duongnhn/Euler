import java.io.*;



public class p8_Largest_product_in_a_series {
	
	public int product(int n) throws FileNotFoundException
	{
        String s = "";
		try
        {
        	FileReader file = new FileReader("C:\\ZIN\\Euler\\src\\p8.txt");
	        BufferedReader br = new BufferedReader(file);
	        String scan;
	        while((scan = br.readLine()) != null)
	        {
	        	s = s+scan;
	            //System.out.println(scan);
	        }
	        br.close();
        }
        catch(IOException e)
        {
        	System.out.println(e.toString());
        }
        int l = s.length();
        int maxProd = 0;
        int curProd;
        for (int i=0;i<l-4;i++)
        {
        	curProd = (int)(s.charAt(i))-48;
        	for (int j=i+1;j<i+n;j++)
        	{
        		curProd = curProd*((int)(s.charAt(j))-48);
        	}
        	if (maxProd < curProd)
        	{
        		maxProd = curProd;
        	}
        }
        return maxProd;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		p8_Largest_product_in_a_series test = new p8_Largest_product_in_a_series();
		try {
			System.out.println(test.product(5));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
