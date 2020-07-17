//1000-digit Fibonacci number
import java.math.BigInteger;


class problem25{

	public static void main(String[] args) {


		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger term = new BigInteger("2");

		int i = 3;

		String num = term.toString();

		while(true){
			if(num.length() == 1000){
				System.out.println(i);
				break;
			}
			a = b;
			b = term;
			term = a.add(b);
			num = term.toString();
			i++;
		}
	}
}