
public class EuroReal {
	
	private double taxaDeConversão = 5.4952;
	
	public double getEuroReal(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
