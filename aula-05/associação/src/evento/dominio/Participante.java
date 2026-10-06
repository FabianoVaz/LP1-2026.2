package evento.dominio;

import java.util.HashSet;
import java.util.Set;

public class Participante extends Usuario {
    private boolean pagante;
    private Set<Evento> eventos = new HashSet<>();
    
    public Participante() {
    }

    public Participante(String nome, String email) {
        this(nome, email, false);
    }

    public Participante(String nome, String email, boolean pagante) {
        setNome(nome);
        setEmail(email);
        setPagante(pagante);
    }

    public boolean isPagante() {
        return pagante;
    }

    public void setPagante(boolean pagante) {
        this.pagante = pagante;
    }

    public Set<Evento> getEventos() {
        return eventos;
    }
}
