
public class Calculadora {

	
	private int num1;
	private int num2;
	
	
	
	
	public Calculadora(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
		
		
	}
	
	
	public int Suma() {
		
	int result = num1 + num2;
	
	return result;	
	
	}
	
	
	public int Resta() {
		
	int result = num1 - num2;
	
	return result;
		
	}
	
	
	public int Multi() {
		
	int result = num1 * num2;
	
	return result;
		
	}
	
	public int Divi() {
		
	int result = num1 / num2;
	
	return result;
		
	}
	
	
	
}
