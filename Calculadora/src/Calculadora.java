import java.io.IOException;
import java.util.Scanner;


public class Calculadora {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//Variaveis locais
		
		int nropccao;
		int nr1;
		int nr2;
		
		// Colocar Inputs
		
		System.out.println("Por favor diga o número da operacao a realizar");
		
		//Lista de Opccoes a fazer na maquina de calcular
		
		System.out.println("1-Calculo normais");
		System.out.println("2-Conversões");

		  Scanner sc = new Scanner(System.in);
		  nropccao = sc.nextInt();
		 
		if(nropccao == 1){
			
			int nrcalculonormal;
			
			System.out.println("1-Somatorio");
			System.out.println("2-Subtraccao");
			System.out.println("3-Multiplicacao");
			System.out.println("4-Divisao");
			System.out.println("5-Piatório");
			
			Scanner sc1 = new Scanner(System.in);
			nrcalculonormal = sc1.nextInt();
			
			if(nrcalculonormal==1){
				
				System.out.println("Cheguei");
				
				System.out.println("Introduza os valores que quer somar:");
				Scanner sc11 = new Scanner(System.in);

				nr1=sc11.nextInt();
				nr2=sc11.nextInt();
				
				Calculonormal somatorio = new Calculonormal();
				somatorio.soma(nr1,nr2);
			}
			
			if(nrcalculonormal==2){
				
				System.out.println("Introduza os valores que quer subtrair:");
				
				Scanner sc12 = new Scanner(System.in);

				nr1=sc12.nextInt();
				nr2=sc12.nextInt();
				
				Calculonormal sub = new Calculonormal();
				sub.subtraccao(nr1, nr2);
				
			}
			
			if(nrcalculonormal==3){
				
				System.out.println("Introduza os valores que quer multiplicar:");
				Scanner sc13 = new Scanner(System.in);

				nr1=sc13.nextInt();
				nr2=sc13.nextInt();
				
				Calculonormal mul = new Calculonormal();
				mul.multiplicacao(nr1, nr2);
				
				
			}
			
			if(nrcalculonormal==4){
				
				System.out.println("Introduza os valores que quer dividir:");
				Scanner sc14 = new Scanner(System.in);

				nr1=sc14.nextInt();
				nr2=sc14.nextInt();
				
				Calculonormal div = new Calculonormal();
				div.divisao(nr1, nr2);
					
			}
			
			if(nrcalculonormal==5){
				
				System.out.println("Introduza os valores para calcular o piatório:");
				Scanner sc15 = new Scanner(System.in);

				nr1=sc15.nextInt();
				nr2=sc15.nextInt();
				
				Piatorio piatorio = new Piatorio();
				piatorio.piatorio(nr1, nr2);
			}
				
		}
		
		if(nropccao==2){
			
			System.out.println("Prima 1 para converter de binário para decimal");
			System.out.println("Prima 2 para converter de decimal para binário");
			Scanner sc2 = new Scanner(System.in);
			int nrconversao=sc2.nextInt();
			
			if(nrconversao==1){
				
				System.out.println("Insira o número a converter:");

				Scanner sc21  = new Scanner(System.in);
				int nrBinDec=sc21 .nextInt();
			
				Conversao binDec = new Conversao();
				binDec.converteBinDec(nrBinDec);
				
			}
			
			if(nrconversao==2){
			
				
				System.out.println("Insira o número a converter:");
				Scanner sc22 = new Scanner(System.in);
				int nrDecBin=sc22.nextInt();
				
				
				Conversao DecBin = new Conversao();
				System.out.println(nrDecBin);
				DecBin.converteDecBin(nrDecBin);
				
			}
		}
	}

}
