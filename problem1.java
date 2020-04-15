//multiples of a or b

class problem1{

	static int limit = 999;

	static int sumDivisibleBy(int n){

		int sum = 0;
		int p = limit/n;

		// System.out.println(p);

		for(int i = n; i < limit; i++){
			if(i%n == 0){
				sum += i;
			}
		}

		return (p*(p+1)*n)/2;
	}

	public static void main(String[] args) {
		int sum = 0;
		int a, b;
		a = 3;
		b = 5;

		// for(int i = 3; i < limit; i++){
		// 	if(i%3 == 0 || i%5 == 0){
		// 		sum += i;
		// 	}
		// }
		System.out.println(sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15));
	}
}