package generics;

public class ClassGeneric<T> {
    private T dato;

    public ClassGeneric(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}
