package week2;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		int[][] array1= {{2,3,6},{4,8,5},{7,9,0}};
		int[][] array2= {{8,5,7},{2,9,11},{13,4,6}};
		
		int sum[][]= new int[3][3];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++) {
				sum[i][j]= array1[i][j] + array2[i][j];
				System.out.print(sum[i][j] +" ");
				
			}
			System.out.println();
		}

	}

}
