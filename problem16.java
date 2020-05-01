//Power Digit Sum

import java.math.BigInteger;


class problem16{

	public static void main(String[] args) {
		
		BigInteger big1, big2;

		big1 = new BigInteger("2");

		int exp = 1000;

		big2 = big1.pow(exp);

		String num = big2.toString();

		int sum = 0;

		for(int i = 0; i < num.length(); i++){
			sum += Character.getNumericValue(num.charAt(i));
		}		

		System.out.println(sum);
	}
}