package refactoring.extractlocalvariable;

import java.util.List;

public class ExtractLocalVariable {

	private static final long DISCOUNT_THRESHOLD = 1000;
	private static final long PERCENT_DISCOUNT = 5;
	public String cartUid;
	private long cartSum;
	private long discount;
	private long totalCartAmount;
	private long cartTotal;

	public long calculateCartTotal(List<Item> items) {
		 cartSum = sumCartCosts(items);
		 discount = calculateDiscount(cartSum);
		 cartTotal = cartSum - discount;
		return cartTotal;
	}

	private long sumCartCosts(List<Item> items) {
		 totalCartAmount = 0;
		for (Item item : items) {
			long itemPrice = item.getPrice();
			totalCartAmount += itemPrice;
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
