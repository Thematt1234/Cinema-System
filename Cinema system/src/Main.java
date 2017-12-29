import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static int ticketsLeft = 3;
	static int buy = 0;

	public static void main(String[] args) {
		system();

	}

	public static void system() {

		System.out.println(
				"Would you like to buy cinema tickets? There are " + ticketsLeft + " tickets left.  \n1.) Yes\n2.) No");
		test();

	}

	public static void soldOut() {
		System.out.println("sorry no tickets left");
		System.exit(0);
	}

	public static void sleep() {
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void test() {
		buy = scan.nextInt();

		switch (buy) {

		case 1:
			System.out.println("Thank you for buying a ticket");
			ticketsLeft--;
			sleep();
			System.out.println("There are " + ticketsLeft + " tickets remaining");
			sleep();
			if (ticketsLeft == 0) {
				soldOut();
			}
			System.out.println("Would you like to buy another ticket?");
			test();

			break;
		case 2:
			System.out.println("Next customer please");
			sleep();
			System.out.println("Would you like to buy a Ticket?");
			test();
			break;
		}
	}

}
