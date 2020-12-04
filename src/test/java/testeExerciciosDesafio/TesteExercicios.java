package testeExerciciosDesafio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exerciciosDesafio.Exercicios;

public class TesteExercicios {

	/* Teste Exerc�cio 1 */
	@Test
	public void TesteAreaTriangulo() {
		Exercicios tExercicios = new Exercicios();
		int area = tExercicios.AreaTriangulo(5, 10);
		assertEquals(25, area);
		
	}
	
	/* Teste Exerc�cio 2 */
	@Test
	public void TesteMaiorValor() {
		Exercicios tExercicios = new Exercicios();
		String mensagem = tExercicios.MaiorValor(10, 5, 3); 
		String mensagem2 = tExercicios.MaiorValor(5, 10, 3); 
		String mensagem3 = tExercicios.MaiorValor(5, 5, 5); 
		
		assertEquals("O maior valor � 10", mensagem);
    	assertEquals("O maior valor � 10", mensagem2);
    	assertEquals("Os valores s�o iguais.", mensagem3);		
		
	}
	
	/* Teste Exerc�cio 3 */
	@Test
	public void TesteSomaInteiros() {
		Exercicios tExercicios = new Exercicios();
		int soma = tExercicios.SomaInteiros();
		assertEquals(soma, 5050);
	}
	
}
