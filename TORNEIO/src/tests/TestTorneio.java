package tests;

import org.junit.Assert;
import org.junit.Test;

import control.TorneioTenis;

public class TestTorneio {

	TorneioTenis tenis ;
	public TestTorneio() {
		tenis = new TorneioTenis();
	}
	
	@Test
	public void testVitoria() {
		char[] Partidas = {'V','V','P','P','P','V'};
		Assert.assertEquals(2,tenis.Torneio(Partidas),0);
	}
	@Test
	public void testDerrota() {
		char[] Partidas = {'P','P','P','P','P','P'};
		Assert.assertEquals(-1,tenis.Torneio(Partidas),0);
	}
	
}
