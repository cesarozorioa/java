package generics;
public class Main {
    //creando un metodo estatico que utiliza genericos
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }
    public static void main(String[] args) {
        ClassGeneric<String> objetoString = new ClassGeneric<>("Hola Mundo");
        System.out.println("Dato String: " + objetoString.getDato());

        ClassGeneric<Integer> objetoInteger = new ClassGeneric<>(123);
        System.out.println("Dato Integer: " + objetoInteger.getDato());

        ClassGeneric<Double> objetoDouble = new ClassGeneric<>(45.67);
        System.out.println("Dato Double: " + objetoDouble.getDato());
        //Usando el metodo estatico con diferentes tipos de datos
        Integer[] arrayInteger = {1, 2, 3, 4, 5};
        System.out.println("Imprimiendo array de Integer:");
        imprimirArray(arrayInteger);
        String[] arrayString = {"Uno", "Dos", "Tres"};
        System.out.println("Imprimiendo array de String:");
        imprimirArray(arrayString);
        Double[] arrayDouble = {1.1, 2.2, 3.3};
        System.out.println("Imprimiendo array de Double:");
        imprimirArray(arrayDouble);
    }
}
