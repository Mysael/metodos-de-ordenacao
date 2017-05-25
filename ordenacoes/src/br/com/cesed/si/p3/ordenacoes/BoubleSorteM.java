package br.com.cesed.si.p3.ordenacoes;

public abstract class BoubleSorteM {
	
	public static void ordenaCrescente1(int[] a){
		for(int i = 0; i<a.length; i++){
			for(int j= 0; j<a.length-1; j++){
				int proximo = a[j+1];
				if(a[j]> a[j+1]){
					a[j+1] = a[j];
					a[j] = proximo;
				}
			}
		}
	}
	public static void ordenaCrescente2(int[] a){
		int cont = 0;
		for(int i = 0; i<a.length-cont; i++){
			for(int j= 0; j<a.length-1; j++){
				int proximo = a[j+1];
				if(a[j]> a[j+1]){
					a[j+1] = a[j];
					a[j] = proximo;
				}
			}cont++;
		}
	}
	
	public static void ordenaDecrescente1(int[] a){
		for (int i = a.length; i>0; i--){
			for(int j = a.length-1; j>0; j--){
				if(a[j] > a[j-1]){
					int varLocal = a[j-1];
					a[j-1] = a[j];
					a[j] = varLocal;
				}
			}
		}
	}
	public static void ordenaDecrescente2(int[] a){
		int cont = 0;
		for (int i = a.length-cont; i>0; i--){
			for(int j = a.length-1; j>0; j--){
				if(a[j] > a[j-1]){
					int varLocal = a[j-1];
					a[j-1] = a[j];
					a[j] = varLocal;
				}
			}cont++;
		}
	}
	
}
