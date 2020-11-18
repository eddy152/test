package variable;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intAry = new int[3][3];
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };

		System.out.println(intAry[1].length);
		
		for (int i = 0; i <intAry.length; i++) {
			for(int q = 0; q <intAry[i].length; q++) {
				System.out.print(intAry[i][q]+ ", ");
			}
			System.out.println();
		}

//		int[][] intAry2 = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };
//
//		System.out.println(intAry2[0].length);
	}

}
