//multiples of a or b

class problem1{
	public static void main(String[] args) {
		int sum = 0;
		int a, b;
		a = 3;
		b = 5;

		int limit = 10;

		for(int i = 3; i < limit; i++){
			if(i%3 == 0 || i%5 == 0){
				sum += i;
			}
		}

		System.out.println(sum);
	}
}