//Largest palindrome product

class problem4{

	// static int max = 1;

	static boolean isPalindrome(int n){

		return revNum(n) == n;
	}

	static int revNum(int n){
		
		int rev = 0;

		while(n > 0){

			rev = rev*10 + n%10;

			n = n/10;

		}

		return rev;
	}

	public static void main(String[] args) {
	
		int max = 1;	

		for(int i = 100;i <= 999;i++){

			for (int j = i;j <=999;j++){

				int prod = i*j;

				if(isPalindrome(prod)){

					if(prod > max){
						
						max = prod;
					}
				}
			}
		}	
		
		// long start = System.nanoTime();

		System.out.println(max);

		// long time = System.nanoTime() - start;

		// System.out.println(time);
	}

}