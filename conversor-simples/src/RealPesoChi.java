
public class RealPesoChi {
	
	private double taxaDeConversão = 154.1307;
	
	public double getRealPesoChi(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
