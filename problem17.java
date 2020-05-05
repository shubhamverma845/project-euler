//Number Letter Counts

import java.util.Scanner;

class problem17{

	static String[] listOnes = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
	static String[] listTwos = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


	static String numToWord(int n){

		String numString = "";

		if(n == 1000){

			numString += "one thousand";

			return numString;
		}

		if(n % 100 == 0){
			numString += listOnes[n/100 - 1] + " hundred";
			return numString;
		}

		if(n % 100 <= 20){

			if(n < 100){

				numString += listOnes[n-1];
				return numString;

			} else{
				int a,b;
				a = n/100;
				b = n%100;

				numString += listOnes[a-1] + " hundred" + " and " + listOnes[b-1];

				return numString;

			}
		} else{

			if(n < 100){
				int a,b;
				a = n/10;
				b = n%10;

				if(b == 0){
					numString += listTwos[a-2];
				} else{
					numString += listTwos[a-2] + " " + listOnes[b - 1];
				}

				
				return numString;
			}

			int a,b,c;
			a = n/100;
			c = n%10;
			n = n/10;
			b = n%10;

			if(c == 0){
				numString += listOnes[a-1] + " hundred" + " and " + listTwos[b-2];

			} else{
				numString += listOnes[a-1] + " hundred" + " and " + listTwos[b-2] + " " + listOnes[c - 1];
			}

			return numString;

		}
	}

	public static void main(String[] args) {
		
		int letters = 0;

		for(int i = 1; i <= 1000; i++){

			String temp;

			temp = numToWord(i);

			temp = temp.replaceAll("\\s", "");

			letters += temp.length();

		}

		System.out.println(letters);	
	}
}