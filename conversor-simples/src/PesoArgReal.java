
public class PesoArgReal {
	
	private double taxaDeConversão = 0.0265;
	
	public double getPesoArgReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
