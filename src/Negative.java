import java.util.Scanner;
public class Negative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number < 0) {
			System.out.println("Negative number!");
		}
		else {
			System.out.println("Positive Number!");
		}
	}
}
