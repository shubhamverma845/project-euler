//Digit fifth Powers

class problem30{
	
	public static int digitSumPoweredN(int num, int pow){
		int sum = 0;
		int rem;
		while(num > 0){
			rem = num % 10;
			sum += Math.pow(rem, pow);
			num /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int power = 5;
		int sum = 0;

		for(int i = 10000; i <= 98632; i++){
			if(digitSumPoweredN(i, power) == i){
				sum += i;
			}
		}		


		//354294 is upper limit, equals 5*(9^5)
		for(int i = 100000; i <= 354294; i++){
			if(digitSumPoweredN(i, power) == i){
				sum += i;
			}
		}

		System.out.println("Sum is::" + sum);

	}
}