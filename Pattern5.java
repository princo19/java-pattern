import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int count=0;
		for (int i =n;i>=1;i--) {
			for (int k=1;k<=count;k++) {
				System.out.print(" ");
			}for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			 System.out.println();
			 count+=1;
		}

	}
	

}
