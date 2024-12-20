
public class AirtelRecharge {
	void recharge(long cardno, String expDate,int cvv) {
		System.out.println("Recharge done through credit/debit card");
	}
	void recharge(long accNo, String bankName) {
		System.out.println("Recahrge done through net banking ");
	}

	void recharge(String userName, long pwd) {
		System.out.println("Recharge done through wallet");
	}
	
	void recharge(int u,float pwd) {
		System.out.println("Dummy method");
	}

	
	public static void main(String[] args) {
		AirtelRecharge ar=new AirtelRecharge();
		ar.recharge(12345678906l, "07/05",1234);
		ar.recharge("Dinga", 7894567891l);
		ar.recharge(12, 24f);
		
	}
}
