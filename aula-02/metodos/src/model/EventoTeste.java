package model;

    /* Classe = UML
    | ------------------|
    |       Evento      |
    | ------------------|
    | - nome: String    |
    | - data: String    |
    | - local: String   |
    | - capacidade: int |
    | ------------------|
    | + resumo(): String|
    | ------------------|
    */

public class EventoTeste {
    // Atributos
    public String nome;
    public String data;
    public String local;
    public int capacidade;

    // Método: Construtor
    public EventoTeste(){}
    public EventoTeste(String nome, String data, String local, int capacidade){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
    }

    // Método
    public String resumo(){
        return nome + " (" + local + ") - até " + capacidade + " vagas";
    }
}
