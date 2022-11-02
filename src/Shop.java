public class Shop {

	private static final int FOOD_MAX = 10;
	private static final String EMPTY_FOOD = "";
	private static final int EMPTY_PRICE = 0;
	private final String shopName;
	private String[] foodNames;
	private int[] prices;


	// Shop 클래스의 멤버 변수에는 shopName, foodName, prices가 있음. 인자로 shopName을 받는다.
	public Shop(String shopName) {
		this.shopName = shopName;
		initValues();
	}

	// foodNames와 prices 멤버 변수를 초기화한다. 둘 다 배열이기 때문에 FOOD_MAX 만큼 배열을 생성하고 각각을 EMPTY_FOOD, EMPTY_PRICE로 채운다.
	private void initValues() {
		foodNames = new String[FOOD_MAX];
		prices = new int[FOOD_MAX];
		for (int i = 0; i < FOOD_MAX; ++i) {
			foodNames[i] = EMPTY_FOOD;
			prices[i] = EMPTY_PRICE;
		}
	}

	/**
	 * 가맹점의 음식을 추가
	 * @param idx 인덱스
	 * @param name 배달 음식 이름
	 * @param price 배달 음식 가격
	 */

	public void addFood(int idx, String name, int price) {
		System.out.println("A new item (" + name + ", " + price + ") is stored at " + shopName);
		foodNames[idx] = name;
		prices[idx] = price;
	}
}
