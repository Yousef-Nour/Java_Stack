public class CalculatorTest {

	public static void main(String[] args) {
		Calculator one = new Calculator();
		
		//should be 0.0
		System.out.println(one .getResult());
		
		Calculator two = new Calculator();
		two.performOperation(09.5, '+', 15.2);
		//should be 24.7
		System.out.println(two.getResult());
		two.performOperation(4, '-', 3);
		
		//should be 1
		System.out.println(two.getResult());
	}

}