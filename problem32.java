//Pandigital Products

class problem32{

	static int[] arr = new int[99000];
	
	public static boolean isPandigital(String num){

		for(int i = 1; i < 10; i++){
			if(num.indexOf(Integer.toString(i)) >= 0){
				continue;
			} else{
				return false;
			}
		}
		return true;
	}

	public static boolean isPandigitalProduct(int a, int b, int c){

		String num = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);

		if(!(num.length() == 9)){
			return false;
		}

		if(num.indexOf("0") >= 0){
			return false;
		}

		return isPandigital(num);
	}

	public static void main(String[] args) {

		int sum = 0;

		for(int i = 1; i <= 9; i++){
			for(int j = 1023; j <= 9876; j++){
				int prod = i*j;
				if(isPandigitalProduct(i,j,prod) && arr[prod] == 0){
					arr[prod] = 1;
					sum += prod;
				}
			}
		}

		for(int i = 10; i <= 98; i++){
			for(int j = 102; j <= 987; j++){
				int prod = i*j;
				if(isPandigitalProduct(i,j,prod) && arr[prod] == 0){
					arr[prod] = 1;
					sum += prod;
				}
			}
		}

		System.out.println(sum);
	}
}