
public class P24LexicographicPermutations {

	public int max = 10;
	public Boolean[] Mark = new Boolean[10];
	public int[] arr = new int[10];
	public String result = "";
	public int count = 0;
	public int target = 1000000;
	
	public void Permutations(int n)
	{
		if (n == max) 
			{
				count++;
				if (count == target){
					for (int j = 0;j < max;j++)
					{
						result = result + arr[j];
					}
				}
			}
		for (int i=0;i < max;i++)
			if (Mark[i])
			{
				Mark[i] = false;
				arr[n] = i;
				Permutations(n+1);
				Mark[i] = true; 
			}
	}
	
	public void Init()
	{
		for (int i=0;i<max;i++)
			Mark[i] = true;
	}
	
	public static void main(String[] args) {
		P24LexicographicPermutations instance = new P24LexicographicPermutations();
		instance.Init();
		instance.Permutations(0);
		System.out.println("" + instance.result);
	}
}
