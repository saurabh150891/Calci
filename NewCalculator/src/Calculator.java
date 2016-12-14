public class Calculator{
	public int add(int x, int y){
	return x+y;
	}
}

class TestCalc{
public static void main(String[] args) {
	Calculator c = new Calculator();
	System.out.println("Addition:" +c.add(4, 4));
}	
}
