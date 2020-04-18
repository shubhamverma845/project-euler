//Largest Prime Factor

class problem3{

	public static void main(String[] args) {
		
		// long start = System.nanoTime();

		long n = 600851475143L;

		long factor = 2;
		long lastFactor = 1;

		if(n % 2 == 0){
			n /= 2;

			lastFactor = 2;

			while(n % 2 ==0){
				n /= 2;
			}
		} else{
			lastFactor = 1;
		}

		factor = 3;

		while(n > 1){

			if(n % factor == 0){

				lastFactor = factor;
				n /= factor;

				while(n % factor == 0){
					n /= factor;
				}

			}

			factor += 2;
		}

		System.out.println(lastFactor);

		// long time = System.nanoTime() - start;

		// System.out.println(time);
	}
}