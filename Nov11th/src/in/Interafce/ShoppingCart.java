package in.Interafce;

public class ShoppingCart {
Payment p;

	public ShoppingCart(Payment p) {
		this.p=p;
	}
	
	void chechOut(double amnt) {
		p.makePayment(amnt);
	}
}
