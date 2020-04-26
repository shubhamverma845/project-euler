//Highly Divisible Triangular Number

class problem12{

	static int numOfDivisors(int n){

		int divCount = 2;

		if(n == 1){
			return 1;
		}

		if(n == 3){
			return 2;
		}

		int root = (int)Math.sqrt(n);

		for(int i = 2; i <= root; i++){
			if(n % i == 0){
				divCount += 2;
			}
		}

		if(root*root == n){
			divCount--;
		}

		return divCount;

	}

	public static void main(String[] args) {
		

		int number = 1;
		int i = 2;


		// long start = System.nanoTime();

		while(numOfDivisors(number) < 500){
			number = number + i;
			i++;
		}

		System.out.println(number);

		// long time = System.nanoTime() - start;
		// System.out.println(time);

	}
}