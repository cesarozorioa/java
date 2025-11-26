package almacen;

public class Orden {
    private final int idOrden;
    private Producto[] carrito;
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS=10;
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.carrito = new Producto[MAX_PRODUCTOS];
    }
    public void agregarProductos(Producto producto){
        if(this.contadorProductos<=10){
            this.carrito[this.contadorProductos++]=producto;
        }else{
            System.out.println("Se ha supeperado el limite de productos");
        }

    }
    public double calcularTotal(){
        double total = 0;
        for(int i=0;i<this.contadorProductos;i++){
            total = total+carrito[i].getPrecio();
        }
        return total;
    }
    public void verOrder(){
        System.out.println("Orden No "+this.idOrden);
        double total = calcularTotal();
        System.out.println("\tEl total de la orden :"+total);
        for(int i=0;i<this.contadorProductos;i++){
            System.out.println((i+1)+" : "+carrito[i]);
        }
    }


}
