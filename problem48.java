//Self Powers

import java.util.ArrayList;
import java.math.BigInteger;


class problem48{

	public static void main(String[] args) {

		long start = System.nanoTime();

		BigInteger num = new BigInteger("10405071317");

		for(int i = 11; i <= 1000; i++){

			BigInteger n = new BigInteger(Integer.toString(i));
			n = n.pow(i);
			num = num.add(n);
		}

		System.out.println(num.mod(new BigInteger("10000000000")));
	}
}