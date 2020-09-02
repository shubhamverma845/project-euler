//Double-Base Palindromes

class problem36{

	public static boolean toBase2(int num){

		if(num < 2){
			return true;
		}

		StringBuilder binRep = new StringBuilder("");

		while(num > 0){
			binRep.append(Integer.toString(num%2));
			num = num/2;
		}

		String s1 = binRep.toString();
		binRep.reverse();
		String s2 = binRep.toString();

		return s1.equals(s2);

	}

	public static boolean isPalindrome(String num){
		StringBuilder numRev = new StringBuilder(num);
		numRev.reverse();
		String s = numRev.toString();

		return num.equals(s);
	}
	
	public static void main(String[] args) {

		int sum = 0;

		for(int i = 1; i < 1000000; i+=2){
			if(isPalindrome(Integer.toString(i)) && toBase2(i)){
				sum += i;
			}
		}

		System.out.println(sum);
	}
}