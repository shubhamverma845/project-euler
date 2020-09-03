//Combinatoric Selectionas

class problem53{

	public static long multiplyNtoR(int n, int r){

		long product = 1;

		for(int i = r; i <= n; i++){
			product *= i;
		}

		return product;
	}

	public static long nCr(int n, int r){
		long p1 = multiplyNtoR(n,n-r+1);
		long p2 = multiplyNtoR(r,1);

		return p1/p2;
	}

	public static void main(String[] args) {		

		int count = 0;

		for(int i = 23; i <= 100; i++){

			for(int r = 4; r < i; r++){

				if(nCr(i,r) > 1000000){

					if(i%2 == 0){
						count += ((int)i/2 - r)*2 + 1;
					} else{
						count += ((int)i/2 - r + 1)*2;
					}
					
					break;
				}
			}
		}

		System.out.println(count);
	}
}