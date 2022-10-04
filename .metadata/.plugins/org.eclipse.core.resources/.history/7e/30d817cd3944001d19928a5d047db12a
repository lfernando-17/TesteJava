package tests;

import org.junit.*;

import control.CalculadoraImc;

public class TestCalcImc {
	
	CalculadoraImc calc;
	
	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}

	@Test
	public void testBaixoPesoaMuitoGrave() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(50.0,1.77, 20, "feminino"));
	}

	@Test
	public void testBaixoMuitoGraveMenor() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(50.0,1.768, 20, "feminino"));
	}

	@Test
	public void testBaixoMuitoGraveMaior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(50.0,1.716, 20, "feminino"));
	}

	@Test
	public void testBaixoPesoMenor() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(50.0,1.715, 20, "feminino"));
	}

	@Test
	public void testBaixoPesoMaior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(50.0,1.645, 20, "feminino"));
	}

	@Test
	public void testPesoNormalMenor() {
		Assert.assertEquals("Peso normal", calc.calcularImc(60.0,1.8, 20, "feminino"));
	}

	@Test
	public void testPesoNormalMaior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(60.0,1.55, 20, "feminino"));
	}

	@Test
	public void testSobrepesoMenor() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(70.0,1.673, 20, "feminino"));
	}

	@Test
	public void testSobrepesoMaior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(70.0,1.53, 20, "feminino"));
	}

	@Test
	public void testObesidadegrauIMenor() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(80.0,1.633, 20, "feminino"));
	}

	@Test
	public void testObesidadegrauIMaior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(80.0,1.512, 20, "feminino"));
	}

	@Test
	public void testObesidadegrauIIMenor() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(80.0,1.51, 20, "feminino"));
	}

	@Test
	public void testObesidadegrauIIMaior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(80.0,1.415, 20, "feminino"));
	}

	@Test
	public void testObesidadegrauIII() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(80.0,1.414, 20, "feminino"));
	}

	@Test
	public void testMulherIdosaBaixoPeso(){
		Assert.assertEquals("Baixo peso", calc.calcularImc(60.0,1.66, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaPesoNormalMenor(){
		Assert.assertEquals("Peso normal", calc.calcularImc(60.0,1.651, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaPesoNormalMaior(){
		Assert.assertEquals("Peso normal", calc.calcularImc(60.0,1.49, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaSobrePesoMenor(){
		Assert.assertEquals("Sobrepeso", calc.calcularImc(70.0,1.6, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaSobrePesoMaior(){
		Assert.assertEquals("Sobrepeso", calc.calcularImc(70.0,1.479, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaObesidadegrauIMenor(){
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(70.0,1.474, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaObesidadegrauIMaior(){
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(70.0,1.376, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaObesidadegrauIIMenor(){
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(80.0,1.47, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaObesidadegrauIIMaior(){
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(80.0,1.382, 66, "feminino"));
	}

	@Test
	public void testMulherIdosaObesidadegrauIIi(){
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(80.0,1.379, 66, "feminino"));
	}

	@Test
	public void testHomemIdosoBaixoPeso(){
		Assert.assertEquals("Baixo peso", calc.calcularImc(60.0,1.66, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoPesoNormalMenor(){
		Assert.assertEquals("Peso normal", calc.calcularImc(60.0,1.651, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoPesoNormalMaior(){
		Assert.assertEquals("Peso normal", calc.calcularImc(60.0,1.49, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoSobrePesoMenor(){
		Assert.assertEquals("Sobrepeso", calc.calcularImc(70.0,1.6, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoSobrePesoMaior(){
		Assert.assertEquals("Sobrepeso", calc.calcularImc(70.0,1.53, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoSobreObesidadeGrauIMenor(){
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(70.0,1.525, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoSobreObesidadeGrauIMaior(){
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(80.0,1.512, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoSobreObesidadeGrauIIMenor(){
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(80.0,1.51, 66, "masculino"));
	}

	@Test
	public void testHomemIdosoSobreObesidadeGrauIIMaior(){
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(80.0,1.415, 66, "masculino"));
	}
	
	@Test
	public void testHomemIdosoSobreObesidadeGrauIII(){
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(80.0,1.41, 66, "masculino"));
	}
}
