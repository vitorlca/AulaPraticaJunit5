package aula.test;

import static org.junit.jupiter.api.Assertions.*;

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
	}
	
	
}
