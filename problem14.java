//Longest Collatz Sequence

import java.util.*;

class problem14{

	static HashMap<Long, Integer> myDict = new HashMap<>();

	static int collatz(long n){

		if(myDict.containsKey(n)){

			return myDict.get(n);
		}

		if(n % 2 == 0){

			myDict.put(n, 1 + collatz(n/2));
		
		}else{

			myDict.put(n, 2 + collatz((3*n + 1)/2));
		}

		return myDict.get(n);
	}

	public static void main(String[] args) {
		
		// long start = System.nanoTime();

		int maxLen = 1;
		int ans = 1;

		myDict.put(1L,1);

		for(int i = 500000; i < 1000000; i++){
			int tempLen = collatz(i);

			if(tempLen > maxLen){
				maxLen = tempLen;
				ans = i;
			}
		}

		System.out.println(ans);

		// long time = System.nanoTime() - start;

		// System.out.println(time);

	}
}