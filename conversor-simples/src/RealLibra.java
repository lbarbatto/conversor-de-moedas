
public class RealLibra {
	
	private double taxaDeConversão = 0.1601;
	
	public double getRealLibra(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
