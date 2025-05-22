package refactoring.rename;

import java.util.List;

public class Rename {

	private static final long PERCENT_DISCOUNT = 5;

	public long calculateCartTotal(List<Item> items) {
		long cartSum = sumCartCosts(items);
		long discount = calculateDiscount(cartSum);
		return cartSum - discount;
	}

	private long sumCartCosts(List<Item> items) {
		long totalCartAmount = 0;
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

