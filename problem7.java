//10001st prime

import java.lang.Math;


class problem7{

	static boolean isPrime(int n){

		if(n == 2){
			return true;
		}

		for(int i = 2;i <= Math.sqrt(n) ;i++){
			
			if(n % i == 0){
				return false;
			} else{
				continue;
			}
		}

		return true;
	}

	public static void main(String[] args) {


		// long start = System.nanoTime();

		int count = 1;
		int n = 2;

		while(count < 10001){
			n++;

			if(isPrime(n) == true){
				count++;
			}

		}

		System.out.println(n);

		// long time = System.nanoTime() - start;

		// System.out.println(time);
		
	}
}