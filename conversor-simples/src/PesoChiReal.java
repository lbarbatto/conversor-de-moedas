
public class PesoChiReal {
	
	private double taxaDeConversão = 0.0065;
	
	public double getPesoChiReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
