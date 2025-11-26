package almacen;

public class PruebaVentas {
    static void main(String[] args) {
        var camisa = new Producto("Camisa",5.50);
        var pantalon = new Producto("Pantalon",12.00);
        var media = new Producto("Media",0.55);
        System.out.println(camisa);
        var orden1 = new Orden();
        var orden2 = new Orden();
        orden1.agregarProductos(camisa);
        orden1.agregarProductos(pantalon);
        orden2.agregarProductos((media));
        orden1.verOrder();
        orden2.verOrder();

    }
}
