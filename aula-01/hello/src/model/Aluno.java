package model;

public class Aluno {
    protected int matricula;
    protected String nome;
    protected String cpf;
    protected Professor professor;

    void teste(){
        professor.siape = 123;
        professor.nome = "123";
    }
}
