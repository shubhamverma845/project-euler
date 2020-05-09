//Amicable Numbers

import java.lang.Math;


class problem21{

	static int divSum(int n){

		int sum = 0;

		for (int i = 1; i <= Math.sqrt(n); i++) 
        { 
            if (n%i == 0) 
            { 
                if (n/i == i) {

                    sum += i; 
                } else{
                	sum += i;
                	sum += n/i; 
                }
                    
            }
        } 

		return sum-n;
	}

	public static void main(String[] args) {
		
		int totSum = 0;

		for(int i = 6; i < 10000; i++){

			int b = divSum(i);
			if(divSum(b) == i && b != i){
				totSum += i;
			}
		}

		System.out.println(totSum);
	}
}