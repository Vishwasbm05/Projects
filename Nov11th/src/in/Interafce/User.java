package in.Interafce;

public class User {
public static void main(String[] args) {
	CreditCard c=new CreditCard();
	ShoppingCart sp=new ShoppingCart(c);
	
	sp.chechOut(500);
	
	
	UPI upi=new UPI();
	ShoppingCart sp1=new ShoppingCart(upi);
	sp1.chechOut(7000);
}
}
