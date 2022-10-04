package tests;

import org.junit.*;

import control.TorneioTenis;


public class TestTorneio {
	
	TorneioTenis torneio;
	
	@Before
	public void setup() {
		torneio = new TorneioTenis();
	}

	@Test
	public void testDerrota() {
		char[] myList = {'P', 'P', 'P', 'P', 'P', 'P'};
		Assert.assertEquals(-1, torneio.calcularGrupo(myList));
	}
	
	@Test
	public void testGrupo() {
		char[] myList = {'V', 'V', 'P', 'P', 'P', 'V'};
		Assert.assertEquals(2, torneio.calcularGrupo(myList));
	}

}
