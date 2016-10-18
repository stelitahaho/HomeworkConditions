import java.util.Scanner;

public class SwitchCards2ndSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert card");
		String card = sc.nextLine();
		switch (card) {
		case "2":
			System.out.println("Valid card");
			break;
		case "3":
			System.out.println("Valid card");
			break;
		case "4":
			System.out.println("Valid card");
			break;
		case "5":
			System.out.println("Valid card");
			break;
		case "6":
			System.out.println("Valid card");
			break;
		case "7":
			System.out.println("Valid card");
			break;
		case "8":
			System.out.println("Valid card");
			break;
		case "9":
			System.out.println("Valid card");
			break;
		case "10":
			System.out.println("Valid card");
			break;
		case "J":
			System.out.println("Valid card");
			break;
		case "K":
			System.out.println("Valid card");
			break;
		case "Q":
			System.out.println("Valid card");
			break;

		case "A":
			System.out.println("Valid card");
			break;
		default:
			System.out.println("The card is not valid");
		}		
	}
}