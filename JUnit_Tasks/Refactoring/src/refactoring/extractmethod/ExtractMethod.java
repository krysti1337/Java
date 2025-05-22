package refactoring.extractmethod;

import java.util.List;

public class ExtractMethod {

	private static final long DISCOUNT_THRESHOLD = 1000;
	private static final long PERCENT_DISCOUNT = 5;
	public String cartUid;

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
		if (cartSum > DISCOUNT_THRESHOLD) {
			return cartSum / 100 * PERCENT_DISCOUNT;
		}
		return 0;
	}
}
