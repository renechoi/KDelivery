import java.util.Scanner;

public class KDeliveryApplication {
	private static int SHOP_MAX = 10;			// idx 형성을 위한 초기화 설정 값
	private static int ORDER_MAX = 20;
	private static int FEEDBACK_MAX = ORDER_MAX;

	private Shop[] shops;
	private Order[] orders;
	private Feedback[] feedbacks;

	private int shopIdx = 0;
	private int orderIdx = 0;
	private int feedbackIdx = 0;


	private final Scanner scan;

	public KDeliveryApplication(){
		scan = new Scanner(System.in);
		initValues();
	}

	private void initValues() {
		shops = new Shop[SHOP_MAX];
		orders = new Order[ORDER_MAX];
		feedbacks = new Feedback[FEEDBACK_MAX];
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
		final String shopName;
		final String foodName;
		final int price;

		System.out.println("Hello, owner");
		System.out.println("What is your store name?");
		shopName = scan.next();

		System.out.println("What is the food name?");
		foodName = scan.next();

		System.out.println("How much is the food?");
		price = scan.nextInt();

		Shop s = new Shop(shopName);
		s.addFood(0, foodName, price);
		shops[shopIdx++] = s;

		System.out.println(">> Registration is completed");
		
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
