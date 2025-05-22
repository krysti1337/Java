package refactoring.inline;

import java.util.List;

public class Inline {

	private static final long PERCENT_DISCOUNT = 5;
	public String cartUid;

	public long calculateCartTotal(List<Item> items) {
		return sumCartCosts(items) - calculateDiscount(sumCartCosts(items));
	}

	private long sumCartCosts(List<Item> items) { 
		long totalCartAmount = 0;
		for (Item item : items) {
			totalCartAmount += item.getPrice();
		}
		return totalCartAmount;
	}

	private long caclulateDiscount(long cartSum) {
		if (cartSum > 1000) {
			return cartSum / 100 * PERCENT_DISCOUNT;
		}
		return 0;
	}

}
