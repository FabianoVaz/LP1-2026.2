package evento.dominio;

import java.time.LocalTime;

public class Programacao {

    private Long id;
    private String titulo;
    private LocalTime horario;
    private String responsavel;

    private Evento evento;

    protected Programacao() {
    }

    public Programacao(Evento evento, String titulo, LocalTime horario, String responsavel) {
        this.titulo = titulo;
        this.horario = horario;
        this.responsavel = responsavel;
        this.evento = evento;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    

    
}
