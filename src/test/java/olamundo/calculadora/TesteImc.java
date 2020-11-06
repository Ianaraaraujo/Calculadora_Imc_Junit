package olamundo.calculadora;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TesteImc {
	
		@BeforeEach
		void setup() {
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 40kg.")
		public void testeAdulto1() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.6, 40);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso, muito grave", resultado);
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 42kg.")
		public void testeAdulto2() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.6, 42);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso, grave", resultado);
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 45kg.")
		public void testeAdulto3() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.6, 45);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso", resultado);
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 50kg.")
		public void testeAdulto4() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.5, 50);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Peso normal", resultado);
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 70kg.")
		public void testeAdulto5() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.6, 70);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Sobrepeso", resultado);
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 80kg.")
		public void testeAdulto6() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.6, 80);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau I", resultado);
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 90kg.")
		public void testeAdulto7() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.6, 90);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau II", resultado);
		}

		@Test
		@DisplayName("21 anos, sexo masculino, 1.6m de altura e 110kg.")
		public void testeAdulto8() {
			CalcImc calc = new CalcImc(21, "Masculino", 1.6, 110);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau III-Obesidade mórbida", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 40kg.")
		public void testeAdulta1() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.6, 40);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso, muito grave", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 42kg.")
		public void testeAdulta2() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.6, 42);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso, grave", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 45kg.")
		public void testeAdulta3() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.6, 45);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 50kg.")
		public void testeAdulta4() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.5, 50);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Peso normal", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 70kg.")
		public void testeAdulta5() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.6, 70);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Sobrepeso", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 80kg.")
		public void testeAdulta6() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.6, 80);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau I", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 90kg.")
		public void testeAdulta7() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.6, 90);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau II", resultado);
		}

		@Test
		@DisplayName("64 anos, sexo feminino, 1.6m de altura e 110kg.")
		public void testeAdulta8() {
			CalcImc calc = new CalcImc(64, "Feminino", 1.6, 110);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau III-Obesidade mórbida", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo feminino - idosa, 1.7m de altura e 40kg.")
		public void testeIdosa1() {
			CalcImc calc = new CalcImc(66, "Feminino", 1.7, 40);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo feminino - idosa, 1.7m de altura e 70kg.")
		public void testeIdosa2() {
			CalcImc calc = new CalcImc(66, "Feminino", 1.7, 70);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Peso normal", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo feminino - idosa, 1.7m de altura e 80kg.")
		public void testeIdosa3() {
			CalcImc calc = new CalcImc(66, "Feminino", 1.7, 80);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Sobrepeso", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo feminino - idosa, 1.7m de altura e 100kg.")
		public void testeIdosa4() {
			CalcImc calc = new CalcImc(66, "Feminino", 1.7, 100);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau I", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo feminino - idosa, 1.7m de altura e 110kg.")
		public void testeIdosa5() {
			CalcImc calc = new CalcImc(66, "Feminino", 1.7, 110);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau II", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo feminino - idosa, 1.7m de altura e 130kg.")
		public void testeIdosa6() {
			CalcImc calc = new CalcImc(66, "Feminino", 1.7, 130);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau III-Obesidade mórbida", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo masculino - idoso, 1.7m de altura e 40kg.")
		public void testeIdoso1() {
			CalcImc calc = new CalcImc(66, "Masculino", 1.7, 40);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo masculino - idoso, 1.7m de altura e 70kg.")
		public void testeIdoso2() {
			CalcImc calc = new CalcImc(66, "Masculino", 1.7, 70);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Peso normal", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo masculino - idoso, 1.7m de altura e 80kg.")
		public void testeIdoso3() {
			CalcImc calc = new CalcImc(66, "Masculino", 1.7, 80);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Sobrepeso", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo masculino - idoso, 1.7m de altura e 100kg.")
		public void testeIdoso4() {
			CalcImc calc = new CalcImc(66, "Masculino", 1.7, 100);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau I", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo masculino - idoso, 1.7m de altura e 110kg.")
		public void testeIdoso5() {
			CalcImc calc = new CalcImc(66, "Masculino", 1.7, 110);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau II", resultado);
		}

		@Test
		@DisplayName("66 anos, sexo masculino - idoso, 1.7m de altura e 130kg.")
		public void testeIdoso6() {
			CalcImc calc = new CalcImc(66, "Masculino", 1.7, 130);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade grau III-Obesidade mórbida", resultado);
		}

		@Test
		@DisplayName("19 anos, menino, 1.6m de altura e 50kg.")
		public void testeMenino1() {
			CalcImc calc = new CalcImc(19, "Masculino", 1.6, 30);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Abaixo do peso", resultado);
		}

		@Test
		@DisplayName("19 anos, menino, 1.6m de altura e 50kg.")
		public void testeMenino2() {
			CalcImc calc = new CalcImc(19, "Masculino", 1.6, 50);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Peso normal", resultado);
		}

		@Test
		@DisplayName("19 anos, menino, 1.6m de altura e 70kg.")
		public void testeMenino3() {
			CalcImc calc = new CalcImc(19, "Masculino", 1.6, 70);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Sobrepeso", resultado);
		}

		@Test
		@DisplayName("19 anos, menino, 1.6m de altura e 90kg.")
		public void testeMenino4() {
			CalcImc calc = new CalcImc(19, "Masculino", 1.6, 90);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade", resultado);
		}

		@Test
		@DisplayName("19 anos, menina, 1.6m de altura e 40kg.")
		public void testeMenina1() {
			CalcImc calc = new CalcImc(19, "Feminino", 1.6, 40);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Baixo peso", resultado);
		}

		@Test
		@DisplayName("19 anos, menina, 1.6m de altura e 50kg.")
		public void testeMenina2() {
			CalcImc calc = new CalcImc(19, "Feminino", 1.6, 50);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Peso normal", resultado);
		}

		@Test
		@DisplayName("19 anos, menina, 1.6m de altura e 70kg.")
		public void testeMenina3() {
			CalcImc calc = new CalcImc(19, "Feminino", 1.6, 70);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Sobrepeso", resultado);
		}

		@Test
		@DisplayName("19 anos, menina, 1.6m de altura e 90kg.")
		public void testeMenina4() {
			CalcImc calc = new CalcImc(19, "Feminino", 1.6, 90);
			double imc = calc.calculoDoImc();
			String resultado = calc.classificacaoGeral(imc);
			assertEquals("Obesidade", resultado);
		}

}