
public class Piatorio extends Calculos {
	
	
	//Local onde vai ser feito o piatorio 
	
	public void piatorio(int nr1, double nr2) {
		
		int resfactorial = factorial(nr1);
		double resexp = Math.exp(nr2);
		System.out.println("O resultado é:");
		System.out.println(resfactorial*resexp);
	
	}
	
	//Metodo auxiliar para calcular o factorial
	
	public int factorial(int nr){
		
		int resultado=nr;
		
		for(int nraux=nr; nraux>1; nraux--){
			
			resultado*=nraux;
		}
		return resultado;
	}
}
