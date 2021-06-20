package myJavaProject;

public class TowersOfHanoi {

	public static void towersOfHanoi(int n, String source, String auxilliary, String destination) {
		if (n == 1) {
			System.out.println(source + " to " + destination);
			return;
		}
		towersOfHanoi(n - 1, source, destination, auxilliary);
		System.out.println(source + " to " + destination);
		towersOfHanoi(n - 1, auxilliary, source, destination);
	}
	
	public static void towerHanoi(int n, char s, char h, char d) {
		if (n == 1) {
			System.out.println("Move 1st disk from " + s + " to " + d);
			return;
		}
		towerHanoi(n - 1, s, d, h);
		System.out.println("Move disk no." + n + " from " + s + " to " + d);
		towerHanoi(n - 1, h, s, d);
	}
	
	public static void main(String[] args) {
		towersOfHanoi(10, "Source" , "Helper", "Destination");
//		towerHanoi(2, 'a', 'b', 'c');
	}
}
