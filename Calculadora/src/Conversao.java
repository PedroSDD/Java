public class Conversao {
	
	
	//Conversao de binario para decimal
	
	public void converteBinDec(int nrbinario){
		
		String str=nrbinario+"";
		str=reverse(str);
		
		int valoraux=0;
		
		String aux = "1"; 
		char ch = aux.charAt(0); 
	
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==ch){
				valoraux=potencia(2,i);
			}
		}
		System.out.println("O seu número a converter é o:"+valoraux);
	}
	
	
	//Conversao de decimal para binario
	public void converteDecBin(int nrdecimal){
		
		String str = "";
		
		for(int i=nrdecimal; i>=1; i=i/2){
		
			if(i%2==0){
				str+="0";
			
			}else{
				str+="1";
			}
		}
		str=reverse(str);
		System.out.println("o seu número a converter é o:"+ str);
	}
	
	//Metodo auxiliar para inverter strings
	public static String reverse(String input){
		
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}

	//Método auxiliar para calcular a potência
	public int potencia(int numero, int nrpotencia){
		
		int resultado=1;
		for(int i=nrpotencia; i>=1; i--){
			resultado*=numero;	
			}
		return resultado;
	}
}
