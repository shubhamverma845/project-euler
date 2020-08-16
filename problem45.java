//Triangular, Pentagonal, and Hexagonal

class problem45{
	
	public static boolean isPenta(long num){

		double root = 1.0 + Math.sqrt(1 + 24*num);

		if(root % 6 == 0.0){
			return true;
		}

		return false;
	}

	public static boolean isHexa(long num){

		double root = 1.0 + Math.sqrt(1 + 8*num);

		if(root % 4 == 0.0){
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
				
		//All Hexagon number are triangular number
		long hexN = 144l;
		long hexNum = 41328l;

		while(!isPenta(hexNum) && hexNum > 0){			
			hexN++;
			hexNum = hexN*(2*hexN - 1);
		}

		System.out.println("The Number is::" + hexNum);
	}
}