//Number Spiral Diagonals

class problem28{

	public static void main(String[] args) {
		
		int dim = 1001;
		int sum = 1;
		int curr = 1;
		int add = 2;

		int sq = dim/2;

		while(sq > 0){
			for(int i = 0; i < 4; i++){
				curr = curr + add;
				sum += curr;
			}
			add += 2;
			sq--;
		}
		
		System.out.println(sum);
	}
}