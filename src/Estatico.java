public class Estatico {
    int valor=0;
    static int contador =0;    
    static void incrementarContador(){
        contador++;
    }
    void incrementarValor(){
        valor++;
    }
    public static void main(String[] args) {
        System.out.println("Contador inicial: "+Estatico.contador);
        Estatico.incrementarContador();
        System.out.println("Contador despues de incrementar: "+Estatico.contador);
        Estatico.incrementarContador();
        System.out.println("Contador despues de incrementar: "+Estatico.contador);
        Estatico e = new Estatico();
        e.incrementarValor();
        System.out.println("Valor de instancia: "+e.valor);
        Estatico.incrementarContador();
    }
    

}
