// even fibonacci numbers

class problem2{

	static long sum = 0;
	static long a = 0;
	static long b = 1;
	static long term = a + b;

	static long fibonacci(long limit){

		while(term < limit){

			if(term % 2 == 0){
				sum += term;
			}

			a = b;
			b = term;
			term = a + b;

		}


		return sum;
	}

	public static void main(String[] args) {

		// long start = System.nanoTime();

		System.out.println(fibonacci(4000000));

		// long time = System.nanoTime() - start;

		// System.out.println(time);
	}
}