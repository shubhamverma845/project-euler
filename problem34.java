//Digit Factorials

class problem34 {

	public static int factorial(int n){
		
		if(n == 0){
			return 1;
		}

		return n*factorial(n - 1);
	}
	

	public static int digitFactSum(int n){
		
		int sum = 0;

		while(n > 0){
			sum += factorial(n%10);
			n /= 10;
		}

		return sum;
	}


	public static void main(String[] args) {
		
		int sum = 0;

		for(int i = 3; i <= 2540160; i++){
			if(digitFactSum(i) == i){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}