
public class CalculatePrime {
	
	public boolean checkPrime(int nr){
		
		int auxcounter=0;
		
		for(int i=nr; i>0; i--){
			
			if(nr%i==0 && i!=1){
				auxcounter++;
				System.out.println("The number: "+i+" is prime");
			}else{
				continue;
			}
		}
		
		if(auxcounter==2){
			return true;
		}else{
			return false;
		}
		
	}
	
	//Metodo que soma os primos
	
	public int somaPrimos(int nrtotal){

		int varaux=0;

		for(int i=0; i<nrtotal; i++){

			if(checkPrime(i)==true){
				varaux++;
			}
		}

		return varaux;
	}

}
