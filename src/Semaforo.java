
enum ColorSemaforo {ROJO,AMARILLO,VERDE};
public class Semaforo {
    ColorSemaforo color;
    boolean hayPaso;
    public Semaforo(ColorSemaforo color, boolean hayPaso){
        this.color=ColorSemaforo.ROJO;
        this.hayPaso=false;
    }
    public void setCambioColor(int sw){
        if (sw==2){
            this.color= ColorSemaforo.AMARILLO;
        }else if(sw==3){
            this.color=ColorSemaforo.VERDE;
            this.hayPaso=true;
        }else{
            this.color=ColorSemaforo.ROJO;
            this.hayPaso=false;
        }
    }

    static void main(String[] args) {
        boolean hayPaso=false;
        ColorSemaforo color=ColorSemaforo.ROJO;

        var s1 = new Semaforo(color,hayPaso);
        s1.setCambioColor(1);

        System.out.println("El semaforo esta "+s1.color);
        if(s1.hayPaso){
            System.out.println("Hay paso");
        }else{
            System.out.println("No hay paso");
        }
    }
}
