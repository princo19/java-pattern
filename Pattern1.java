import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
//		for (int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					System.out.print("*");
//					
//				}System.out.println();
//			
//		}

		// using while loop

		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col += 1;

			}
				System.out.println();
				row+=1;
		}

	}

}
