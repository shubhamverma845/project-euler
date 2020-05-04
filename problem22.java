//Names Score

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class problem22{


	static long score(String s, int idx){
		long sc = 0;

		for(int i = 0; i < s.length(); i++){
			sc += (s.charAt(i) - 64);
		}

		return sc*idx;
	}

	public static void main(String[] args) throws FileNotFoundException{
		

		Scanner myScanner = new Scanner(new File("problem22.txt"));

		String nameString = myScanner.nextLine();

		String[] nameList = nameString.split("\",\"");

		nameList[0] = "MARY";
		nameList[5162] = "ALONSO";

		for(int i = 0; i < nameList.length; i++){
			for(int j = i; j < nameList.length; j++){
				if(nameList[i].compareTo(nameList[j]) > 0){
					String temp = nameList[i];
					nameList[i] = nameList[j];
					nameList[j] = temp;
				}
			}
		}

		long totScore = 0;

		for(int l = 0; l < nameList.length; l++){
			totScore += score(nameList[l], l+1);
		}

		System.out.println(totScore);

	}
}