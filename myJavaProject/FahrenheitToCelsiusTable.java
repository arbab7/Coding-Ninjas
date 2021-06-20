package myJavaProject;
import java.util.Scanner;
public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S,E,W;
		S= s.nextInt();
		E= s.nextInt();
		W= s.nextInt();
		
		int C;

		if (0 <= S && S<= E && S <= E && E<= 900 && 0 <= W && W<= E ) {
			while (S<=E) {
				C= (S-32)*5/9;
				System.out.println(S+"\t"+C);
				S+=W;
			}

		}


	}

}
