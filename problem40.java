//Champernowne's constant

class problem40{
	public static void main(String[] args) {

		int i = 1;

		StringBuilder num = new StringBuilder("");
		while(num.length() < 1000000){
			num.append(String.valueOf(i));
			i++;
		}
		
		int d1 = Character.getNumericValue(num.charAt(0));
		int d10 = Character.getNumericValue(num.charAt(9));
		int d100 = Character.getNumericValue(num.charAt(99));
		int d1000 = Character.getNumericValue(num.charAt(999));
		int d10000 = Character.getNumericValue(num.charAt(9999));
		int d100000 = Character.getNumericValue(num.charAt(99999));
		int d1000000 = Character.getNumericValue(num.charAt(999999));

		int prod = d1*d10*d100*d1000*d10000*d100000*d1000000;


		System.out.println(prod);
	}
}