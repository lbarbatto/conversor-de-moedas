
public class RealDollar {
	
	private double taxaDeConversão = 0.1933;
	
	public double getRealDollar(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
