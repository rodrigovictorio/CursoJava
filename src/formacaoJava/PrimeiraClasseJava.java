package formacaoJava;

import cursoJava.classes.Aluno;

public class PrimeiraClasseJava {
    public static void main(String[] args) {

		/*
		 * - new Aluno() é uma INSTÂNCIA (Criação de OBJETO)
		 * - aluno1 é uma referência para o OBJETO aluno
		 */
		Aluno aluno1 = new Aluno(); // Aqui será o João
		aluno1.nome = "João";
		System.out.println(aluno1.nome);

		Aluno aluno2 = new Aluno(); // Aqui será o Pedro
		Aluno aluno3 = new Aluno(); // Aqui será o Rodrigo
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("José", 50);
		
	}
}
