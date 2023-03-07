package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}		
		System.out.println(alunos);
		
		boolean paulo = alunos.contains("Paulo Silveira");
		System.out.println(paulo);
		
		alunos.remove("Sergio Lopes");
		System.out.println(alunos);
		
		// O Set não é uma lista ordenada
		// Caso seja necessário saber a posição de algum objeto
		// podemos usar o comando:
		// List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}
}
