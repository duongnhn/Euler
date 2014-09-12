import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class P102TriangleContainment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "p102_triangles.txt";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			int count = 0;
			int totalLine = 0;
			while ((line = br.readLine()) != null) {
				totalLine ++;
			   // process the line.
				String[] arr = line.split(",");
				int[] coor = new int[6];
				for (int i= 0;i < 6;i++){
					coor[i] = Integer.parseInt(arr[i]);
				}
				if (P102TriangleContainment.ContainOrigin(coor[0], coor[1], coor[2], coor[3], coor[4], coor[5]))
					count++;
			}
			br.close();
			System.out.println(totalLine + " " + count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Boolean ContainOrigin(int Ax, int Ay, int Bx, int By, int Cx, int Cy)
	{
		int dx, dy;
		long val;
		//line 0A
		dx = -Ay; dy = Ax;
		val = (long)(dx*Bx+dy*By)*(long)(dx*Cx+dy*Cy);
		if (val > 0) return false;

		//line 0B
		dx = -By; dy = Bx;
		val = (long)(dx*Ax+dy*Ay)*(long)(dx*Cx+dy*Cy);
		if (val > 0) return false;

		//line 0C
		dx = -Cy; dy = Cx;
		val = (long)(dx*Bx+dy*By)*(long)(dx*Ax+dy*Ay);
		if (val > 0) return false;

		return true;
	}

}
