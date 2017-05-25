package br.com.cesed.si.p3.array;
import br.com.cesed.si.p3.ordenacoes.BoubleSorteM;

public class RodaArray {
	

	public static void main(String[] args) {
		int[] arrayDeInt = new int[]{59,40,20,10,7,95,540,23,41,60};
		
		/*BoubleSorteM.ordenaCrescente2(arrayDeInt);
		//BoubleSorteM.ordenaDecrescente(arrayDeInt);
		
		for(int elemento : arrayDeInt){
			System.out.println(elemento);
		}*/
		BoubleSorteM.ordenaDecrescente1(arrayDeInt);
		for(int elemento : arrayDeInt){
			System.out.println(elemento);
		}
		
		/*for (int i = 0; i < arrayDeInt.length; i++) {
			System.out.println(arrayDeInt[i]);
		}*/
		
		
		//System.out.println(arrayDeInt[9]);
	}

	
}
