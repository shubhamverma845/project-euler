//Circular Primes

class problem35{

	public static boolean isCircular(int n){

		int len = (int)Math.log10(n) + 1;

		if(problem10.isPrime(n)){

			int multplier = (int)Math.pow(10, len-1);

			for(int i = 1; i < len; i++){
				int digit = n%10;
				n = digit*multplier + n/10;
				if(problem10.isPrime(n)){
					continue;
				} else{
					return false;
				}
			}

			return true;
			
		} else{
			return false;
		}
	}

	public static void main(String[] args) {

		long start = System.nanoTime();

		int count = 0;

		for(int i = 2; i < 1000000; i++){
			if(isCircular(i)){
				count++;
			}
		}

		System.out.println(count);

		long time = System.nanoTime() - start;
		System.out.println(time);
	}
}