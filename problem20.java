//Factorial Digit Sum

import java.math.BigInteger;

class problem20{

	static BigInteger one = new BigInteger("1");

	static BigInteger fact(BigInteger n){

		if(n.intValue() == 1){
			return new BigInteger("1");
		}

		return n.multiply(fact(n.subtract(one)));
	}

	public static void main(String[] args) {
		
		BigInteger big = new BigInteger("100");


		String ans = fact(big).toString();

		int sum = 0;

		for(int i = 0; i < ans.length(); i++){
			sum += Character.getNumericValue(ans.charAt(i));
		}

		System.out.println(sum);
	}
}