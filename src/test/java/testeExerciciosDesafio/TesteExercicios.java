package testeExerciciosDesafio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exerciciosDesafio.Exercicios;

public class TesteExercicios {

	/* Teste Exercício 1 */
	@Test
	public void TesteAreaTriangulo() {
		Exercicios tExercicios = new Exercicios();
		int area = tExercicios.AreaTriangulo(5, 10);
		assertEquals(25, area);
		
	}
	
	/* Teste Exercício 2 */
	@Test
	public void TesteMaiorValor() {
		Exercicios tExercicios = new Exercicios();
		String mensagem = tExercicios.MaiorValor(10, 5, 3); 
		String mensagem2 = tExercicios.MaiorValor(5, 10, 3); 
		String mensagem3 = tExercicios.MaiorValor(5, 5, 5); 
		
		assertEquals("O maior valor é 10", mensagem);
    	assertEquals("O maior valor é 10", mensagem2);
    	assertEquals("Os valores são iguais.", mensagem3);		
		
	}
	
	/* Teste Exercício 3 */
	@Test
	public void TesteSomaInteiros() {
		Exercicios tExercicios = new Exercicios();
		int soma = tExercicios.SomaInteiros();
		assertEquals(soma, 5050);
	}
	
}
