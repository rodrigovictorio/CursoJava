package formacaoJava;

import cursoJava.classes.Aluno;

public class PrimeiraClasseJava {
    public static void main(String[] args) {

		/*
		 * - new Aluno() é uma INSTÂNCIA (Criação de OBJETO)
		 * - aluno1 é uma referência para o OBJETO aluno
		 */
		Aluno aluno1 = null; // Aqui será o João

		aluno1.setNome("João");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1974");
		aluno1.setRegistroGeral("12.345.678-9");
		aluno1.setNumeroCpf("123.456.789+10");
		aluno1.setNomeMae("Marta");
		aluno1.setNomePai("Paulo");
		aluno1.setDataMatricula("10/01/2024");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("JDev Treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);

		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Nº da identidade: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe: " + aluno1.getNomeMae());
		System.out.println("Nome do pai: " + aluno1.getNomePai());
		System.out.println("Data da matrícula: " + aluno1.getDataMatricula());
		System.out.println("Série matriculado: " + aluno1.getSerieMatriculado());
		System.out.println("Colégio: " + aluno1.getNomeEscola());
		System.out.printf("Média do aluno: %.2f\n", aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

		System.out.println("");

		Aluno aluno2 = new Aluno(); // Aqui será o Pedro

		aluno2.setNome("Pedro");
		aluno2.setIdade(32);
		aluno2.setDataNascimento("18/10/1972");
		aluno2.setRegistroGeral("12.345.678-9");
		aluno2.setNumeroCpf("123.456.789+10");
		aluno2.setNomeMae("Carla");
		aluno2.setNomePai("Tiago");
		aluno2.setDataMatricula("10/01/2024");
		aluno2.setSerieMatriculado("2");
		aluno2.setNomeEscola("JDev Treinamento");
		aluno2.setNota1(60);
		aluno2.setNota2(82.8);
		aluno2.setNota3(59.9);
		aluno2.setNota4(98.7);

		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Nº da identidade: " + aluno2.getRegistroGeral());
		System.out.println("CPF: " + aluno2.getNumeroCpf());
		System.out.println("Nome da mãe: " + aluno2.getNomeMae());
		System.out.println("Nome do pai: " + aluno2.getNomePai());
		System.out.println("Data da matrícula: " + aluno2.getDataMatricula());
		System.out.println("Série matriculado: " + aluno2.getSerieMatriculado());
		System.out.println("Colégio: " + aluno2.getNomeEscola());
		System.out.printf("Média do aluno: %.2f\n", aluno2.getMediaNota());
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado: " + aluno2.getAlunoAprovado2());

		System.out.println("");

		Aluno aluno3 = new Aluno(); // Aqui será o Rodrigo
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		
	}
}
