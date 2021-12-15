
public class sumability {
	public static void main (String[] args) {
		int s = 0;
		for (int i= 0; i<=100; i++) {
			System.out.println(i);
			s=s+i;
		}
		System.out.println("Sum of all numbers between 1 and 100 is " + s + ".");
	}
}