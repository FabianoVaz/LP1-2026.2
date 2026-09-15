public class Teste {
    
    public static void main(String[] args){
        // Números
        int inteiro = 1;        
        long inteiro2x = 2;
        
        float decimais = 1.5f;
        float decimais_ = (float) 1.5;
        double float2x = 1.5;

        // Lógico
        boolean booleano = true;
        boolean booleano_ = false;

        // Textual
        char character = 'F';
        char nome[] = {'F', 'a'};
        String texto = "Fabiano Vaz";

        // Estrutura de Decisão
        // Decisão Simples
        if(true){
            // Bloco TRUE
        }
        
        // Decisão Composta
        int nota = 8;
        if( nota >= 7 ){
            // Bloco TRUE
            System.out.println("Aprovado");
        }else{
            // Bloco FALSE
            System.out.println("Reprovado");
        }
        
        // Operador de Decisão Composta
        String msg = (nota >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(msg);

        // Operadores
        // + - / * %
        // < <= == !=
        // && || !
        boolean teste = true;

        // Estrutura de Repetição
        // Pré-testada
        int x = 5;
        while(x<10){
            x++;
        }

        // Pós-testada
        do{
            x++;
        }while(x<10);
        
        // Repetição Controlada
        int i=0;
        for( i=5; i<10; i++){
            System.out.println(i);
        }

        int numeros[] = {10,20,30,40,50,60,70};
        for ( int n : numeros) {
            System.out.println( n );
        }
    }

    public int somar(){
        return 0;
    }

}
