//Sum Square Difference

class problem6{

	static int sumOfn(int n){
		int sum = n*(n+1)/2;
		return sum;
	}

	static int sumSquareDiff(int n){
		int sN = sumOfn(n);
		int sN2 = sN*sN;
		int term = sN*(2*n + 1)/3;
		return sN2 - term;
	}

	public static void main(String[] args) {
		

		System.out.println(sumSquareDiff(100));
	}
}