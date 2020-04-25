//Summation of primes

import java.lang.Math;

class problem10{
	
	static boolean isPrime(int n){

		if(n == 1){
			return false;
		}

		if(n < 4){
			return true;
		}

		if(n % 2 == 0){
			return false;
		}

		if(n < 9){
			return true;
		}

		if(n % 3 == 0){
			return false;
		}

		int rootN = (int)Math.sqrt(n);

		int f = 5;

		while(f <= rootN){
			if(n % f == 0 || n % (f+2) == 0){
				return false;
			}

			f += 6;
		}

		return true;

	}

	public static void main(String[] args) {

		
		// long start = System.nanoTime();

		long sum = 0;

		for(int i = 2; i < 1999994; i++){

			if(isPrime(i)){
				sum += i;
			}
		}

		System.out.println(sum);

		// long time = System.nanoTime() - start;

		// System.out.println(time);
		
	}
}