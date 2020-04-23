//Special Pythagorean Triplet

class problem9{

	static boolean isPythTrip(int a, int b, int c){

		if(a*a + b*b == c*c){
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
			

		// long start = System.nanoTime();


		int prod = 1;

		for(int i = 3; i < 1000; i++){
			for(int j = i + 1; j < 1000 - i - 1; j++){

				int k = 1000 - j - i;
				if(isPythTrip(i,j,k)){
					prod = i*j*k;
				}
			}
		}

		System.out.println(prod);

		// long time = System.nanoTime() - start;

		// System.out.println(time);
	}
}