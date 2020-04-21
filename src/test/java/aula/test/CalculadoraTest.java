package aula.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calc;
	
	@BeforeEach
	void init() {
		System.out.println("----INICIO METODO----");
		calc = new Calculadora();
	}

	@Nested
	@DisplayName("Cenario001 - Teste Soma")
	class testeSoma{
		
		@Test
		@DisplayName("CT001.01 - Teste Soma Valores Positivos")
		void testeSoma01() {
			int valorEsperado = 80;
			int valorAtual = calc.somar(30, 50);
			
			assertEquals(valorEsperado, valorAtual, "Resultado atual difere do esperado!");
		}
		
		@Test
		@DisplayName("CT001.02 - Teste Soma Valores Negativos")
		void testeSoma02() {
			int valorEsperado = -27;
			int valorAtual = calc.somar(-12, -15);
			
			assertEquals(valorEsperado, valorAtual, "Resultado atual difere do esperado!");
		}
	}
	
	@Nested
	@DisplayName("Cenario002 - Teste Subtracao")
	class testeSubritacao {
		
		@Test
		@DisplayName("CT002-01 - Teste Subtrair Positivo e Negativo")
		void testeSubtrair01() {
			int valorEsperado = 80;
			int valorAtual = calc.subtrair(50, -30);
			
			assertEquals(valorEsperado, valorAtual, "Resultado atual difere do esperado");
		}
		
		@Test
		@DisplayName("CT002-02 - Teste Subtrair Zero e Positivo")
		void testeSubtrair02() {
			int valorEsperado = 30;
			int valorAtual = calc.subtrair(0, -30);
			
			assertEquals(valorEsperado, valorAtual, "Resultado atual difere do esperado");
		}
	}
	
	@Test
	@DisplayName("Cenario003 - Teste Multiplicacao Varios Valores")
	void testeMultiplicaNValores() {
		assertAll(
				() -> assertEquals(-4, calc.mutiplicar(2, -2)),
				() -> assertEquals(14, calc.mutiplicar(7, 2)),
				() -> assertEquals(-18, calc.mutiplicar(-3, 6)),
				() -> assertEquals(30, calc.mutiplicar(-6, -5)),
				() -> assertEquals(0, calc.mutiplicar(20, 0))
				);
	}
	
	
	
	@AfterEach
	void end() {
		System.out.println("----FIM DO METODO----");
	}
}
