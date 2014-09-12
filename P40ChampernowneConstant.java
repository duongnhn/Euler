import java.util.ArrayList;


public class P40ChampernowneConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mList = new ArrayList<Integer>();
		mList.add(1);
		mList.add(10);
		mList.add(100);
		mList.add(1000);
		mList.add(10000);
		mList.add(100000);
		mList.add(1000000);
		
		int max = 1000000;
		int count = 0;
		int number = 0;
		long prod = 1;
		while (count <= max)
		{
			number++;
			String tempStr = "" + number;
			for (int i = 0;i < tempStr.length();i++)
			{
				count++;
				if (mList.contains(count))
				{
					String str = "" + tempStr.charAt(i);
					prod = prod * Integer.parseInt(str);
					System.out.println(count+ " " + prod + " " + str);
				}
			}
		}			
	}

}
