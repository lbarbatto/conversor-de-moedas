
public class RealPesoArg {
	
	private double taxaDeConversão = 37.679;
	
	public double getRealPesoArg(double valorInserido) {
		
		return (valorInserido * taxaDeConversão);
		
	}

}
