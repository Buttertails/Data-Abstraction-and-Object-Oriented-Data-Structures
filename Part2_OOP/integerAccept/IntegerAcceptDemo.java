package integerAccept;

public class IntegerAcceptDemo {

	public static void main(String[] args) {
		IntegerAccept intAcc = new IntegerAccept(0, 100);
		intAcc.getValue();
		intAcc.getValue();
		
		intAcc.setMin(100);
		intAcc.setMax(1000);
		intAcc.getValue();
		intAcc.getValue();
	}

}
