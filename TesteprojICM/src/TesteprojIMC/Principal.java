/**
 * Projeto: Desenvolvimento de um codigo para o calculo do IMC em JAVA
 * 
 * @author adenilson
 * 
 *Resumo: Este projeto foi um desafio do curso Coursera/ITA,
 *no curso de Desenvolvimento em liguagem orientada a objetico com JAVA.
 *Ele foi desenvolvido em 4 classes: 
 *1ª) Uma que recebe os dados do paciente, PacienteIMC
 *2ª) Uma que calcula o IMC do paciente, CalcularIMC
 *3ª) Uma que faz o diagnostico do IMC, DiagnosticarIMC
 *4ª) Uma classe principal que recebe e os paramatros do paciente e 
 *mostra o resultado do IMC, Principal.
 *A classe principal instancia as classes e informa os dados que serão 
 *processados pelo sistema. Logo após isso, mostra o resultado do
 *calculo e o diagnostico.
 * 
 */
package TesteprojIMC;

public class Principal {

	public static void main(String[] args) {
		
		PacienteIMC p1 = new PacienteIMC();
		p1.nomePaciente = "Pedro";
		p1.pesoPaciente = 105.5;
		p1.alturaPaciente = 2;
		CalcularIMC resul = new CalcularIMC();
		DiagnosticarIMC dp1 = new DiagnosticarIMC();
		
		PacienteIMC p2 = new PacienteIMC();
		p2.nomePaciente = "Maria";
		p2.pesoPaciente = 45.8;
		p2.alturaPaciente = 1.60;
		CalcularIMC resul2 = new CalcularIMC();
		DiagnosticarIMC dp2 = new DiagnosticarIMC();
		
		PacienteIMC p3 = new PacienteIMC();
		p3.nomePaciente = "Antonio";
		p3.pesoPaciente = 79.5;
		p3.alturaPaciente = 1.8;
		CalcularIMC resul3 = new CalcularIMC();
		DiagnosticarIMC dp3 = new DiagnosticarIMC();
		
		
		System.out.println("Resultados da Analise do IMC \n");
		
		System.out.println(
				"Paciente: "+p1.nomePaciente+
				"\nPeso: "+p1.pesoPaciente+" kg"+
				"\nAltura: "+p1.alturaPaciente+" m"+
				"\nResultadoIMC: "+ Math.round(resul.calculoIMC(p1))+" kg/m²"+
				"\nDiagnosticoIMC: "+dp1.ResultadoIMC(resul)
				);
		
		System.out.println("------------------------------------------");
		
		System.out.println(
				"Paciente: "+p2.nomePaciente+
				"\nPeso: "+p2.pesoPaciente+" kg"+
				"\nAltura: "+p2.alturaPaciente+" m"+
				"\nResultadoIMC: "+ Math.round(resul2.calculoIMC(p2))+" kg/m²"+
				"\nDiagnosticoIMC: "+dp2.ResultadoIMC(resul2)
				);
		
		System.out.println("------------------------------------------");
		
		System.out.println(
				"Paciente: "+p3.nomePaciente+
				"\nPeso: "+p3.pesoPaciente+" kg"+
				"\nAltura: "+p3.alturaPaciente+" m"+
				"\nResultadoIMC: "+ Math.round(resul3.calculoIMC(p3))+" kg/m²"+
				"\nDiagnosticoIMC: "+dp3.ResultadoIMC(resul3)
				);
		
		System.out.println("------------------------------------------");
				
	}

}
