public class Funciones {
    int valor=10;
    static double variable = 9.81;
    static void main() {
        int numero=5;
        long factorial=calculaFactorial(5);
        System.out.println("El factorial de "+numero+" = "+factorial);
        var obj1 = new Funciones();
        var obj2 = new Funciones();
        obj1.valor=5;
        obj2.valor=10;
        System.out.println("valor de obj1.valor="+obj1.valor);
        System.out.println("Valor de obj2.value= "+obj2.valor);
    }
    static long calculaFactorial(int numero){
        long factorial = 1;
        for(int i=1;i<=numero;i++){
            factorial *=i;
        }

        return factorial;
    }
}
