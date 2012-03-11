
final public class MatrixImplementation {

	private int indexM;
	private int indexN;
	private int[][] mat;
	
	//Initialize a m*n matrix of 0s
	MatrixImplementation(int m, int n){
		this.indexM = m;
		this.indexN = n;
		mat = new int[m][n];
	}
	
	//Create a 2D matrix based on input
	MatrixImplementation(int[][] inp){
		indexM = inp.length;
		indexN = inp[0].length;
		this.mat = new int[indexM][indexN];
		
		for (int i = 0; i < indexM; i++) {
			for (int j = 0; j < indexN; j++) {
				this.mat[i][j] = inp[i][j]; 
			}
		}
		
	}
	/*public MatrixImplementation randomGen(int m, int n) {
		MatrixImplementation mRandom = new MatrixImplementation(m,n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mRandom.mat[i][j] = Math.random();
			}
		}
		return mRandom;
	}*/
	
	//Transpose of a matrix
	public MatrixImplementation Transpose(MatrixImplementation a){
		MatrixImplementation output = new MatrixImplementation(indexM, indexN);
		try{
			for (int i = 0; i < indexM; i++) {
				for (int j = 0; j < indexN; j++) {
					output.mat[i][j]= a.mat[j][i];
				}
			
			}
			
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex);
		}
		return output;
	}
	
	public void show(){
		for (int i = 0; i < indexM; i++) {
			for (int j = 0; j < indexN; j++) {
				System.out.printf("%9.4f", mat[i][j]);
			}
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		int[][] matInput = {{1,2,3},{4,5,6}};
		MatrixImplementation m1 = new MatrixImplementation(matInput);
		System.out.println();
		
		
		MatrixImplementation m2 = m1.Transpose(m1);
		//m2.show();
		System.out.println(m2);
		
		
	}
}
