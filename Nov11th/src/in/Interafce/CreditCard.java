package in.Interafce;

public class CreditCard implements Payment {

	@Override
	public void makePayment(double amnt) {
		// TODO Auto-generated method stub
		System.out.println("payment done through credit card is "+amnt);
	}

}
