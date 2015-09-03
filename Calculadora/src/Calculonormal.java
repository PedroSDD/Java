
public class Calculonormal extends Calculos{
	
	//local onde vao ser feitos os calculos ditos normais
	
	//Metodo soma
	
	public int soma(int nr1, int nr2) {
		System.out.println("O resultado é:");
		System.out.println(+nr1+nr2);
		return nr1+nr2;
	}
	
	//Metodo subtraccao
	
	public int subtraccao(int nr1, int nr2) {
		System.out.println("O resultado é:");
		System.out.println(nr1-nr2);
		return nr1-nr2;
	}
	
	
	//Metodo divisao
	public double divisao(double nr1, double nr2) {
		System.out.println("O resultado é:");
		System.out.println(nr1/nr2);
		return nr1/nr2;
	}
	
	//Metodo multiplicacao
	
	public int multiplicacao(int nr1, int nr2) {
		System.out.println("O resultado é:");
		System.out.println(nr1*nr2);
		return nr1*nr2;
	}

}
