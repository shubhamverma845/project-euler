//Largest Product in Grid

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;


class problem11{


	public static void main(String[] args) throws FileNotFoundException{
		
		int[][] grid = new int[20][20];
		int len = 20;

		File myFile = new File("problem11.txt");

		Scanner myScanner = new Scanner(myFile);

		while(myScanner.hasNextInt()){
			for(int i = 0; i < len; i++){
				for(int j = 0; j < len; j++){
					grid[i][j] = myScanner.nextInt();
				}
			}
		}

		int prod = 1;
		int prodDown = 0;
		int prodSide = 0;
		int prodRevDiag = 0;
		int prodDiag = 0;



		for(int i = 0; i <= len; i++){
			for(int j = 0; j <= len; j++){

				try{
					
					prodSide = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
				}
				catch(Exception e){
					prodSide = 0;
				}

				try{
					prodDown = grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
				}
				catch(Exception e1){
					prodDown = 0;
				}

				try{
					prodDiag = grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
				}
				catch(Exception e3){
					prodDiag = 0;
				}

				try{
					prodRevDiag = grid[i+3][j]*grid[i+2][j+1]*grid[i+1][j+2]*grid[i][j+3];
				}
				catch(Exception e4){
					prodRevDiag = 0;
				}

				int temp1 = Math.max(prodDown, prodSide);
				int temp2 = Math.max(prodDiag, prodRevDiag);

				int temp = Math.max(temp1, temp2);

				if(temp > prod){
					prod = temp;
				}

			}
		}

		System.out.println(prod);
	}
}