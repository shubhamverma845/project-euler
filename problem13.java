//Large Sum

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class problem13{

	public static void main(String[] args) throws FileNotFoundException{
		String[] number = new String[100];

		int[] sum = new int[50];

		Arrays.fill(sum, 0);

		File myFile = new File("problem13.txt");

		Scanner myScanner = new Scanner(myFile);

		int i = 0;

		while(myScanner.hasNextLine()){
			number[i++] = myScanner.nextLine();
		}

		for(int j = 0; j < 100; j++){
			for(int k = 0; k < 50; k++){
				// System.out.println(number[j].charAt(k));
				sum[k] += Integer.parseInt(String.valueOf(number[j].charAt(k)));
			}
		}

		// System.out.println(sum[0]);


		int carry = 0;

		for(int l = sum.length - 1; l > 0; l--){
			sum[l] += carry;
			carry = sum[l]/10;
			sum[l] = sum[l]%10;
		}

		sum[0] += carry;

		for(int m = 0; m < 8; m++){
			System.out.print(sum[m]);
		}

		// System.out.println(sum[0] + "" + sum[1] + "" + sum[2] + "" + sum[3] + "" + sum[4]);
	}
}