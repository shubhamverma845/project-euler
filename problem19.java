//Counting Sundays

class problem19{


	static boolean isLeap(int year){

		if((year%4==0)&&(year%100!=0) || (year%400==0)){
			return true;
		}

		return false;
	}


	public static void main(String[] args) {

		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int weekCount = 0;
		int ans = -2;		//compensating for year 1900
		String[] monthName = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		String[] weekName = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

		for(int i = 1900; i <= 2000; i++){
			
			if(isLeap(i)){
				monthDays[1] = 29;
			} else{
				monthDays[1] = 28;
			}

			for(int j = 0; j < 12; j++){
				for(int k = 1; k <= monthDays[j]; k++){
					while(true){

						if(weekName[weekCount%7] == "SUN" && k == 1){
							ans++;
						}
						
						weekCount++;
						if(k==monthDays[j]){
							break;
						}
						k++;
						
					}
				}
			}
		}

		System.out.println(ans);
	}
}