package br.com.alura;

import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17546);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);


            for (Aluno a : javaColecoes.getAlunos()) {
                System.out.println(a);
            }

            System.out.println("O aluno " + a1 + " está matriculado?");
            System.out.println(javaColecoes.estaMatriculado(a1));

            Aluno turini = new Aluno("Rodrigo Turini", 34672);
            System.out.println("E esse turini está matriculado?");
            System.out.println(javaColecoes.estaMatriculado(turini));

            System.out.println("o a1 é equals ao Turini?");
            System.out.println(a1.equals(turini));

            // obrigatoriamente o seguinte é true

            System.out.println(a1.hashCode() == turini.hashCode());


        }
    }
}
