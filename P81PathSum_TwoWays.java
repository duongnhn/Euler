import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class P81PathSum_TwoWays {

	public int size = 80;
	public int[][] matrix = new int[size][size];
	public static int[] moveRow = new int[]{1, 0};
	public static int[] moveCol = new int[]{0, 1};
	public long minimalSum = Long.MAX_VALUE;
	public long sum = 0; 
	
	public String readFile(String file) throws IOException {
    BufferedReader reader = new BufferedReader( new FileReader (file));
    String line = null;
    StringBuilder  stringBuilder = new StringBuilder();

    while (( line = reader.readLine()) != null) {
    	stringBuilder.append(line);
    	stringBuilder.append(",");
    }
    reader.close();
    return stringBuilder.toString();
	}
	
	public void InitMatrix() throws IOException
	{
		String str = readFile("p081_matrix.txt");
		String delims = ",";
		String[] strArray = str.split(delims);
		for (int k=0;k < size*size;k++)
		{
			int row = (int) k / size;
			int col = k % size;
			matrix[row][col] = Integer.parseInt(strArray[k]);
		}
	}
	
	public void Move(int row, int col){
		if ((row >= size)|| (col >= size)) return;
		if (sum >= minimalSum) return;
		if ((row != size-1)||(col != size-1))		
		{
			for (int i=0;i<=1;i++)
			{
				sum = sum + matrix[row][col];
				Move(row + moveRow[i], col + moveCol[i]);
				sum = sum - matrix[row][col];
			}
		}
		else{
			if (sum < minimalSum){
				minimalSum = sum;
				System.out.println("" + minimalSum);
			}
		}
	}
	
	public void DynamicProgramming()
	{
		long[][] sumMatrix = new long[size][size];
		
		sumMatrix[0][0] = matrix[0][0];
		for (int col=1;col<size;col++)
			sumMatrix[0][col] = sumMatrix[0][col-1] + matrix[0][col];
		for (int row=1;row<size;row++)
		  sumMatrix[row][0] = sumMatrix[0][row-1] + matrix[0][row];
		for (int row=1;row<size;row++)
			for (int col=1;col<size;col++)
			{
				sumMatrix[row][col] = sumMatrix[row][col-1] + matrix[row][col];
				if (sumMatrix[row][col] >= sumMatrix[row-1][col] + matrix[row][col])
					sumMatrix[row][col] = sumMatrix[row-1][col] + matrix[row][col];
			}
		
		minimalSum = sumMatrix[size-1][size-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P81PathSum_TwoWays instance = new P81PathSum_TwoWays();
		try {
			instance.InitMatrix();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instance.DynamicProgramming();
		long result = instance.minimalSum;
		System.out.println("" + result);
	}

}
