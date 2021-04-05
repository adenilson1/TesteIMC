package TesteprojIMC;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteIMC {
	
	private PacienteIMC paciente;
	private CalcularIMC resultado;
	private DiagnosticarIMC diagnostico;
	
	@Before
	public void objetoPaciente() {
		this.paciente = new PacienteIMC();
		this.resultado = new CalcularIMC();
		this.diagnostico = new DiagnosticarIMC();
	}

	@Test
	public void testBaixoPesoMuitoGrave() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 50.0;
		
		//avliacao do calculo do IMC
		//Nota: o medoto Math.round() server para arredonda o valor 
		//o resultado do calculo
		assertEquals(15,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Baixo peso muito grave";
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));
	}
	
	@Test
	public void testBaixoPesoGrave() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 55.0;
		
		//avaliacao do calculo do IMC
		assertEquals(17,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Baixo peso grave";
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));
	}
	
	@Test
	public void testBaixoPeso() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 59.0;
		
		//avaliacao do calculo do IMC
		assertEquals(18,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Baixo peso";
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));
	}
	
	@Test
	public void testPesoNormal() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 60.0;
		
		//avaliacao do calculo do IMC
		assertEquals(19,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Peso normal";
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));
	}
	
	@Test
	public void testSobrepeso() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 90.0;
		
		//avaliacao do calculo do IMC
		assertEquals(28,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Sobrepeso";
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));	
	}
	
	@Test
	public void testObesidadeGrauI() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 110.0;
		
		//avliacao do calculo do IMC
		assertEquals(34,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Grau I";
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));
	}
	
	@Test
	public void testObesidadeGrauII() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 120.0;
		
		//avliacao do calculo do IMC
		assertEquals(37,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Grau II";		
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));	
	}
	
	@Test
	public void testObesidadeGrauIII() {
		paciente.alturaPaciente = 1.80;
		paciente.pesoPaciente = 140.0;
		
		//avliacao do calculo do IMC
		assertEquals(43,Math.round(resultado.calculoIMC(paciente)),0);
		
		//avaliacao do diagnostico IMC
		String diag = "Grau III";
		assertEquals(diag,diagnostico.ResultadoIMC(resultado));	
	}

}
