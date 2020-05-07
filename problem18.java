//Maximum Path Sum 1

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class problem18{

	public static void main(String[] args) throws FileNotFoundException{
		
		File myFile = new File("problem18.txt");

		Scanner myScanner = new Scanner(myFile);

		int[][] triangle = new int[15][15];

		while(myScanner.hasNextInt()){
			for(int i = 0; i < 15; i++){
				for(int j = 0; j < 15; j++){

					triangle[i][j] = myScanner.nextInt();
				}
			}
		}

		for(int k = 13; k >= 0; k--){
			for(int l = 0; l <= k; l++){

				int temp = Math.max(triangle[k+1][l], triangle[k+1][l+1]);
				triangle[k][l] += temp;
			}
		}

		System.out.println(triangle[0][0]);
	}
}