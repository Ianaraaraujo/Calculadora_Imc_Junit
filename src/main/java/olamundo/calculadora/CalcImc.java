package olamundo.calculadora;

public class CalcImc {
	private int idade;
	private String sexo;
	private double altura;
	private double peso;

	public CalcImc(int idade, String sexo, double altura, double peso) {
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}

	public String classificacaoGeral(double imc) {

		if (this.peso > 0 && this.altura > 0) {

			if (idade < 0)
				return "Os valores inseridos são inválidos";

			else if (this.idade < 20 && this.sexo.compareTo("Feminino") == 0)
				return classificacaoMeninas(imc);

			else if (this.idade < 20 && this.sexo.compareTo("Masculino") == 0)
				return classificacaoMeninos(imc);

			else if (this.idade > 65 && this.sexo.compareTo("Feminino") == 0)
				return classificacaoMulheresIdosas(imc);

			else if (this.idade > 65 && this.sexo.compareTo("Masculino") == 0)
				return classificacaoHomensIdosos(imc);
		}

		
		if (this.sexo.compareToIgnoreCase("Masculino") == 0 || this.sexo.compareToIgnoreCase("Feminino") == 0) {

			String classificador = "IMC não classificado";
			System.out.println("Caiu no classificacaoGeral");

			if (this.idade >= 20 && this.idade <= 65) {

				if (imc < 16)
					classificador = "Abaixo do peso, muito grave";
				else if (imc <= 16.99)
					classificador = "Abaixo do peso, grave";
				else if (imc <= 18.49)
					classificador = "Abaixo do peso";
				else if (imc <= 24.99)
					classificador = "Peso normal";
				else if (imc <= 29.99)
					classificador = "Sobrepeso";
				else if (imc <= 34.99)
					classificador = "Obesidade grau I";
				else if (imc <= 39.99)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III-Obesidade mórbida";
			}

			return classificador;
		}

		else
			return "Valores inválidos";

	}

	public String classificacaoMeninos(double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificacaoMeninos");

		if (this.sexo.compareTo("Masculino") == 0) {

			if (this.idade <= 2) {

				if (imc < 15)
					classificador = "Abaixo do peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 21)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 4) {

				if (imc < 14)
					classificador = "Abaixo do peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 6) {

				if (imc < 14)
					classificador = "Abaixo do peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18.3)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 8) {

				if (imc < 14)
					classificador = "Abaixo do peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 10) {

				if (imc < 14.5)
					classificador = "Abaixo do peso";

				else if (imc <= 19)
					classificador = "Peso normal";

				else if (imc <= 22)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 12) {

				if (imc < 15.2)
					classificador = "Abaixo do peso";

				else if (imc <= 21)
					classificador = "Peso normal";

				else if (imc <= 23)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 14) {

				if (imc < 16.3)
					classificador = "Abaixo do peso";

				else if (imc <= 22.5)
					classificador = "Peso normal";

				else if (imc <= 26)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 16) {

				if (imc < 16.8)
					classificador = "Abaixo do peso";

				else if (imc <= 24)
					classificador = "Peso normal";

				else if (imc <= 26.5)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 18) {

				if (imc < 18.9)
					classificador = "Abaixo do peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 27.9)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			else {

				if (imc < 18.9)
					classificador = "Abaixo do peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 27.9)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			return classificador;

		}

		else
			return classificacaoMeninas(imc);

	}

	public String classificacaoMeninas(double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificacaoMeninas");
		
		if (this.sexo.compareTo("Feminino") == 0) {

			if (this.idade <= 2) {

				if (imc < 15)
					classificador = "Abaixo do peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 4) {

				if (imc < 14)
					classificador = "Abaixo do peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 6) {

				if (imc < 14)
					classificador = "Abaixo do peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 19)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 8) {

				if (imc < 14)
					classificador = "Abaixo do peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20.7)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 10) {

				if (imc < 14.5)
					classificador = "Abaixo do peso";

				else if (imc <= 20)
					classificador = "Peso normal";

				else if (imc <= 23)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 12) {

				if (imc < 15.5)
					classificador = "Abaixo do peso";

				else if (imc <= 21.8)
					classificador = "Peso normal";

				else if (imc <= 25)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 14) {

				if (imc < 16.3)
					classificador = "Abaixo do peso";

				else if (imc <= 23.2)
					classificador = "Peso normal";

				else if (imc <= 27)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 16) {

				if (imc < 17.2)
					classificador = "Abaixo do peso";

				else if (imc <= 24.7)
					classificador = "Peso normal";

				else if (imc <= 29)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 18) {

				if (imc < 18.2)
					classificador = "Abaixo do peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 30.2)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			else {

				if (imc < 18.5)
					classificador = "Abaixo do peso";

				else if (imc <= 26.5)
					classificador = "Peso normal";

				else if (imc <= 32.7)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			return classificador;
		}

		return classificacaoMeninos(imc);

	}

	public String classificacaoHomensIdosos(double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificacaoHomensIdosos");

		if (this.sexo.compareTo("Masculino") == 0) {

			if (this.idade > 65) {

				if (imc < 21.9)
					classificador = "Abaixo do peso";
				else if (imc <= 27)
					classificador = "Peso normal";
				else if (imc <= 30)
					classificador = "Sobrepeso";
				else if (imc <= 35)
					classificador = "Obesidade grau I";
				else if (imc <= 39.9)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III-Obesidade mórbida";

			}

			else if (this.idade <= 20)
				return classificacaoMeninos(imc);
			else
				return classificacaoGeral(imc);

		}

		return classificador;

	}

	public String classificacaoMulheresIdosas(double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificacaoMulheresIdosas");
			
		if (this.sexo.compareTo("Feminino") == 0) {

			if (this.idade > 65) {

				if (imc < 21.9)
					classificador = "Abaixo do peso";
				else if (imc <= 27)
					classificador = "Peso normal";
				else if (imc <= 32)
					classificador = "Sobrepeso";
				else if (imc <= 37)
					classificador = "Obesidade grau I";
				else if (imc <= 41.9)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III-Obesidade mórbida";

			}

			else if (this.idade <= 20)
				return classificacaoMeninas(imc);
			else
				return classificacaoGeral(imc);
		}

		return classificador;
	}

	public double calculoDoImc() {
		double imc = this.peso / (Math.pow(this.altura, 2));
		return imc;
	}


}
