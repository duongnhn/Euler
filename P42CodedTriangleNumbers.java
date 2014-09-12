import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class P42CodedTriangleNumbers {

	public ArrayList<Integer> triangleList = new ArrayList<Integer>();	
	
	public void Init()
	{
		for (int n=1; n<= 100; n++)
		{
			int t = n*(n+1)/2;
			triangleList.add(t);
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P42CodedTriangleNumbers rv =  new P42CodedTriangleNumbers();
		rv.Init();
		String file = "p042_words.txt";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			int count = 0;
			int totalWord = 0;
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
			   // process the line.
				sb.append(line+",");
			}			
			br.close();
			String[] arr = sb.toString().split(",");
			for (int i=0;i< arr.length;i++)
			{
				if (rv.IsTriangleWord(arr[i].replace('"',' ').trim())) count++;
			}
			totalWord = arr.length;
			System.out.println(totalWord + " " + count);
			System.out.println(rv.IsTriangleWord("SKY").toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	public Boolean IsTriangleWord(String str)
	{
		int sum = 0;
		for (int i=0; i< str.length();i++)
		{
			sum = sum + str.charAt(i) - 'A' + 1;
		}
		if (triangleList.contains(sum))	return true;
		else return false;
	}

}
