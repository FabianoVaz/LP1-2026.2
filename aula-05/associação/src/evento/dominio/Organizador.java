package evento.dominio;

public class Organizador extends Usuario {

    private String setor;

    // Construtores
    protected Organizador() {}
    
    public Organizador(String nome, String email, String setor) {
        super(nome, email);
        setSetor(setor);
    }

    // Métodos de Acesso
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
