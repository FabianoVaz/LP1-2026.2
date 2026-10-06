package evento.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** 
- id: Long
- nome: String
- data: LocalDate
- local: String
- capacidade: int
- organizador: Organizador
- programacao: List<Programacao>
- participantes: Set<Participante>
 */

public class Evento {
    // Atributos
    private Long id;
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidade;

    private Organizador organizador;

    private List<Programacao> programacao = new ArrayList<>();
    private Set<Participante> participantes = new HashSet<>();
    
    // Construtores
    protected Evento() {
    }

    public Evento(String nome, LocalDate data, String local, int capacidade, Organizador organizador) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.organizador = organizador;
    }

    // Métodos Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public List<Programacao> getProgramacao() {
        return programacao;
    }

    public void setProgramacao(List<Programacao> programacao) {
        this.programacao = programacao;
    }

    public Set<Participante> getParticipantes() {
        //return participantes;
        return new HashSet<>(participantes);
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    
    
}
