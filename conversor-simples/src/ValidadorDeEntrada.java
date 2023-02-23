
public class ValidadorDeEntrada {
	
	public boolean entradaValida(String entrada) {
		try {
			Double.parseDouble(entrada);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
