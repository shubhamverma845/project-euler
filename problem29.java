//Distinct Powers

import java.util.ArrayList;
import java.math.BigInteger;


class problem29{

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		for(int i = 2; i <= 100; i++){
			for(int j = 2; j <= 100; j++){

				BigInteger num = new BigInteger(Integer.toString(i));
				num = num.pow(j);
				String number = num.toString();

				if(!list.contains(number)){
					list.add(number);
				}
			}
		}

		System.out.println(list.size());
	}
}