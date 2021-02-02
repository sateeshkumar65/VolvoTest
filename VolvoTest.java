package com.sateesh.test;

public class VolvoTest {
	
	public static void main(String args[]) {
		VolvoTest vt = new VolvoTest();
		System.out.println(vt.solution(1));
	}

	public int solution(int K) {
		// write your code in Java SE 11
		 int A[][] = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
		//int A[][] = { {0, 0, 0,0}, {0, 0, 0,0}, {0, 0, 0,0},{0, 0, 0,0} };

		if (A == null || A.length == 0)
			return 0;

		int rowLength = A.length;
		int colLength = A[0].length;

		int count = 0;
		int row = 0;
		int col = 0;

		for (int i = 0; i <= rowLength - 1; i++) {
			int k = 0;

			// Find the column with value as '1'
			while (k <= colLength - 1) {
				if (A[i][k] == 1) {
					row = i;
					col = k;
					break;
				}
				k++;

			}

			for (int j = 0; j <= colLength - 1; j++) {

				if (j != k) {
					
					// Verify if abs of the rows is greater than 1.
					if (Math.abs(i - row) + Math.abs(j - col) > K) {

						// go inside the loop only if row is greater than 0
						if (i > 0) {
							
							// verify if previous row column has value of 1
							if (A[i - 1][j] != 1) {
								
								// verify if this is the last row
								if (i + 1 > rowLength - 1) {
									System.out.println("Row is" + i + "and column is " + j);
									count++;
									
								} else if (A[i + 1][j] != 1) {
									System.out.println("Row is" + i + "and column is " + j);
									count++;
								}
							}
						} else {
							 System.out.println("Row is" + i + "and column is " + j);
							count++;
						}
					}
				}
			}
		}
		return count;
	}

}
