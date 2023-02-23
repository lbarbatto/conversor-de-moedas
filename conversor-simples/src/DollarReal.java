
public class DollarReal {
	
	private double taxaDeConversão = 5.1724;
	
	public double getDollarReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
