//Permuted Multiples

class problem52{
	
	public static boolean isPermuted(int a, int b){
		StringBuilder aS = new StringBuilder(Integer.toString(a));
		StringBuilder bS = new StringBuilder(Integer.toString(b));

		for(int i = 0; i < aS.length(); i++){
			String c = aS.substring(i,i+1);
			int idx = bS.indexOf(c);
			if(idx == -1){
				continue;
			} else{
				bS.deleteCharAt(idx);
			}
		}

		if(bS.length() > 0){
			return false;
		}

		return true;
	}

	public static boolean isPermutedMultiple(int num){
		for(int i = 2; i <= 6; i++){
			int n = num*i;
			if(isPermuted(num, n)){
				continue;
			} else{
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		long start = System.nanoTime();

		int n = 1;
		int lim = 10;

		outerloop:
		while(true){

			for(int i = n; i < lim/6; i++){
				if(isPermutedMultiple(i)){
					System.out.println(i);
					break outerloop;
				}
				continue;
			}

			n = n*10;
			lim = lim*10;
		}

		long time = System.nanoTime() - start;
		System.out.println(time);
	}
}