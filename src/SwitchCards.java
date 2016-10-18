import java.util.Scanner;

public class SwitchCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert card");
		String card = sc.nextLine();
		switch (card) {
		case "2":
		case "3":
		case "4":
		case "5":				
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "K":
		case "Q":				
		case "A":
			System.out.println("Valid card");
			break;
		default:
			System.out.println("The card is not valid");
		}		
}
}