package br.com.cesed.si.p3.testes;
import br.com.cesed.si.p3.ordenacoes.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BoubleSorteMTeste {
	
	
	@Test
	public void ordenaCrescente(){
		int[] arrayDeInt = new int[]{59,40,20,10,7,95,540,23,41,60};
		BoubleSorteM.ordenaCrescente2(arrayDeInt);
		Assert.assertEquals(arrayDeInt[0], 7);
		Assert.assertEquals(arrayDeInt[arrayDeInt.length-1], 540);
		//Assert.assertEquals(arrayDeInt[arrayDeInt-1], 540);
	}
	@Test
	public void ordenaDecrescente(){
		int[] arrayDeInt = new int[]{59,40,20,10,7,95,540,23,41,60};
		BoubleSorteM.ordenaDecrescente2(arrayDeInt);
		Assert.assertEquals(arrayDeInt[0], 540);
		Assert.assertEquals(arrayDeInt[arrayDeInt.length-1], 7);
	}
}
