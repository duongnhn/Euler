import java.math.BigInteger;


public class P20FactorialDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n = new BigInteger("1");		
		BigInteger i = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		BigInteger ten = new BigInteger("10");
		BigInteger hundred = new BigInteger("101");
		while (i.compareTo(hundred) == -1)
		{
			n = n.multiply(i);
			i = i.add(one);
		}
    BigInteger sum = BigInteger.ZERO;
    while (n.compareTo(BigInteger.ZERO) == 1) {
        sum = sum.add(n.remainder(ten));
        n = n.divide(ten);
    }
    System.out.println("" + sum);
	}

}
