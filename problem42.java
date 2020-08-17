//Coded Triangle Numbers

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class problem42{

	public static boolean isTriangleNum(int n){
		
		double root = Math.sqrt(1 + 8*n) - 1.0;

		if(root % 2 == 0){
			return true;
		}

		return false;
	}

	public static int wordIdxSum(String word){

		int sum = 0;
		String alpha = "*ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for(int i = 0; i < word.length(); i++){
			sum += alpha.indexOf(word.charAt(i));
		}

		return sum;
	}

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner mySc = new Scanner(new File("problem42.txt"));
		String fileString = mySc.nextLine();
		Scanner sc = new Scanner(fileString);
		sc.useDelimiter("[\",]+");

		int count = 0;

		while(sc.hasNext()){

			String word = sc.next();

			if(isTriangleNum(wordIdxSum(word))){
				count++;
			}
		}

		System.out.println(count);
	}
}