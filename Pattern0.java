import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
//		for (int i =1;i<=n;i++) {
//			System.out.println("*");
//		}
//		using while loop
	int row=1;
	while(row<=n) {
		System.out.print("*");
		row+=1;
		System.out.print("\n");
	}
	}

}
