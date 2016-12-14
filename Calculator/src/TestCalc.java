public class TestCalc{

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("The addition of two numbers is: " + c.add(3, 3));
		System.out.println("The addition of two numbers is: " + c.sub(3, 3));
		System.out.println("The addition of two numbers is: " + c.product(3, 3));
		System.out.println("The addition of two numbers is: " + c.divide(3, 3));
	}

}
