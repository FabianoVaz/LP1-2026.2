import java.time.LocalDate;

import evento.dominio.Evento;
import evento.dominio.Organizador;
import evento.dominio.Participante;

/**
Escreva uma classe Main que cria:
    - um organizador
    - dois participantes
    - um evento
imprime os dados com os métodos get e tenta gravar um valor inválido em cada
set da tabela de validações.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Organizador org1 = new Organizador("Manuel", "maria@gmail.com", "marketing");

        Participante participante1 = new Participante("Silva", "email-1");
        Participante participante2 = new Participante();
        participante2.setNome("Eduardo");
        participante2.setEmail("email-2");

        LocalDate dataEvento = null;

        Evento evento = new Evento(
            "TechWeek", 
            dataEvento, 
            "IFBA", 
            100, 
            org1);
        
        System.out.println( "O evento " + evento.getNome() + " é organizado por " + evento.getOrganizador().getNome() + " do " + evento.getOrganizador().getSetor() );
    }
}
