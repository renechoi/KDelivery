import java.util.Scanner;

public class KDeliveryApplication {

	private final Scanner scan;

	public KDeliveryApplication(){
		scan = new Scanner(System.in);
		initValues();
	}

	private void initValues() {
	}

	public static void main(String[] args) {
		KDeliveryApplication kd = new KDeliveryApplication();
		int menu = 5; // set default;

		do{
			menu = kd.selectMainMenu();

			switch(menu){
				case 1: kd.selectAddShopMenu(); break;
				case 2: kd.selectDashboardMenu(); break;
				case 3: kd.selectOrderMenu(); break;
				case 4: kd.selectFeedbackMenu(); break;
			}
		} while (menu !=5);
		
		
	}

	private void selectFeedbackMenu() {
	}

	private void selectOrderMenu() {
		
	}

	private void selectDashboardMenu() {
		
	}

	private void selectAddShopMenu() {
		
	}

	public int selectMainMenu() {
		System.out.println("  KDelivery Application");
		System.out.println("-------------------------------");
		System.out.println("1. Register the store");
		System.out.println("2. View store's rate");
		System.out.println("3. Order food");
		System.out.println("4. Rate store");
		System.out.println("5. Exit");
		System.out.println("> How may I help you? ");

		int select = scan.nextInt();
		return select;
	}


}
