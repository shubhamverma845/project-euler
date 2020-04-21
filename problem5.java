//Smallest Multiple

class problem5{

	static long gcd1(long a, long b) 
    { 
      if (b == 0) 
        return a; 
      return gcd1(b, a % b);  
    } 

	static long lcm(long a, long b){
		return (a*b)/gcd1(a,b);
	}

	public static void main(String[] args) {
		
		long ans = 1;
		long a = 2;
		long b = 3;

		while(b <= 20){
			ans = lcm(a,b);
			b++;
			a = ans;

		}

		System.out.println(ans);

	}

}