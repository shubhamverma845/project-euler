//Non-abundant Sums
import java.util.ArrayList;


class problem23{

	static ArrayList<Integer> list = new ArrayList<Integer>();

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

	static boolean isAbundant(int n){

		if(divSum(n) > n){
			return true;
		} else{
			return false;
		}
	}

	static boolean searchSum(int n, int j){
		int i = 0;

		while(i <= j){
			if(n > list.get(i) + list.get(j)){
				i++;
			}else if(n < list.get(i) + list.get(j)){
				j--;
			} else{
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		long start = System.nanoTime();

		int sum = 0;

		
		for(int i = 12; i <= 20161; i++){
			if(isAbundant(i)){
				list.add(i);
			}
		}

		int l = list.size() - 1;

		for(int k = 1; k <= 20161; k++){
			if(!searchSum(k, l)){
				sum += k;
			}
			
		}

		
		System.out.println(sum);
		long time = System.nanoTime() - start;
		System.out.println(time);
	}
}