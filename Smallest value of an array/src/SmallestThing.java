import java.util.ArrayList;
import java.util.Scanner;

public class SmallestThing {

	public static void main(String[] args) {


		ArrayList<Integer> list = new ArrayList<Integer>(5);
		String searchWord;
		String value="value";
		String index="index";

		System.out.println("Diga quantos números pretende introduzir");
		Scanner nrint = new Scanner(System.in);
		int nrtotal = nrint.nextInt();

		System.out.println("Por favor introduza a lista");


		for(int i=0; i<nrtotal; i++){

			Scanner na = new Scanner(System.in);
			int nradd = na.nextInt(); 
			list.add(nradd);

		}

		System.out.println("Por favor introduza o que pretende procurar");

		Scanner sw = new Scanner(System.in);
		searchWord=sw.nextLine();

		if(searchWord.equals(value)){
			
			smallestNumber(list);
		
		}
		if(searchWord.equals(index)){
			
			smallestNumberPosition(list);

		}else
			System.out.println("Opcção inválida");
		
	}

		//Method to calculate the smallest number

		public static int smallestNumber(ArrayList<Integer> list){
			
			int aux=list.get(0);

			for(int i=0; i<(list.size()-1); i++){

				if(list.get(i)<aux){
					aux=list.get(i);
				}
			}
			
			System.out.println("O número mais pequeno é "+aux);
			return aux;
		
			
		}
		
		//Method to calculate the smallest number and give the position
		
		public static int smallestNumberPosition(ArrayList<Integer> list){
			
			int aux=smallestNumber(list);
			int smallestnumberposition=0;
			
			for(int i=0; i<list.size()-1; i++){
				
				if(list.get(i)==aux){
					smallestnumberposition=i+1;
				}
			}
			System.out.println("Posição é: "+smallestnumberposition);
			return smallestnumberposition;
		}
	}
