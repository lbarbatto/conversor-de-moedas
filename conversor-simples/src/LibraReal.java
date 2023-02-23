
public class LibraReal {
	
	private double taxaDeConversão = 6.2446;
	
	public double getLibraReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
