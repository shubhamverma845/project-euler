//Lattice Paths

class problem15{


	public static void main(String[] args) {
		
		int size = 21;

		long[][] lattice = new long[size][size];

		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				if(i == 0 || j == 0){
					lattice[i][j] = 1;
				}

				if(i > 0 && j > 0){
					lattice[i][j] = lattice[i-1][j] + lattice[i][j-1];
				}
			}
		}

		System.out.println(lattice[size-1][size-1]);

	}
}