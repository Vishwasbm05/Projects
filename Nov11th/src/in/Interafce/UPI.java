package in.Interafce;

public class UPI implements Payment{

	@Override
	public void makePayment(double amnt) {
		// TODO Auto-generated method stub
		System.out.println("payment done through upi that is "+amnt);
	}

}
