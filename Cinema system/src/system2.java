import java.util.Scanner;

public class system2 {

	static Scanner scan = new Scanner(System.in);
	static int ticketsLeft = 3;
	static int buy = 0;
	static int ticketsBought;

	public static void main(String[] args) {
		system();
	}

	public static void system() {

		System.out.println("Would you like to buy cinema tickets? \n1.) Yes\n2.) No");
		buy = scan.nextInt();

		test();
	}

	public static void test() {

		switch (buy) {

		case 1:
			System.out.println("How many would you like to buy?");
			ticketsBought = scan.nextInt();

			if (ticketsBought > ticketsLeft) {
				System.out.println(
						"There arent enough tickets, there are only " + ticketsLeft + " left \n Please try again");
				test();
			}
			if (ticketsBought < 1) {
				System.out.println("next Customer please");
				system();
			}
			ticketsLeft -= ticketsBought;
			System.out.println("Thank you for buying a ticket");
			sleep();
			System.out.println("There are " + ticketsLeft + " tickets remaining");
			sleep();
			if (ticketsLeft == 0) {
				soldOut();
			}
			System.out.println("Would you like to buy another ticket? \n 1.)Yes 2.)No");
			int another = scan.nextInt();
			switch (another) {
			case 1:
				test();
				break;
			case 2:
				System.out.println("next Customer please");
				sleep();
				system();
				break;
			}
			test();

			break;
		case 2:
			System.out.println("Next customer please");
			sleep();
			system();
			break;
		}
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

}
