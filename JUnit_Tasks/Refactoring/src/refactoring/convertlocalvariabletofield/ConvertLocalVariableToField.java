package refactoring.convertlocalvariabletofield;

import java.util.List;

public class ConvertLocalVariableToField {

	private static final long PERCENT_DISCOUNT = 5;
	public static String cartUid;

	private long cartSum;
	private long discount;
	private long totalCartAmount;
	private long cartTotal;

	public long calculateCartTotal(List<Item> items) {
		cartSum = sumCartCosts(items);
		discount = calculateDiscount(cartSum);
		return cartSum - discount;
	}

	private long sumCartCosts(List<Item> items) {
		totalCartAmount = 0;
		for (Item item : items) {
			totalCartAmount += item.getPrice();
		}
		return totalCartAmount;
	}

	private long calculateDiscount(long cartSum) {
		if (cartSum > 1000) {
			return cartSum / 100 * PERCENT_DISCOUNT;
		}
		return 0;
	}
}

}
