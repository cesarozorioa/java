package almacen;
public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos=0;
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        contadorProductos++;
        this.idProducto=contadorProductos;
    }
    //
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Producto: "+this.idProducto+" "+this.nombre+" "+this.precio;
    }
}
