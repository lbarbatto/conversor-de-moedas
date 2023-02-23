
public class RealEuro {
	
	private double taxaDeConversão = 0.1819;
	
	public double getRealEuro(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
