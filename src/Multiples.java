public class Multiples {
    static void main(String[] args) {
        String dia="Lunes";
        switch (dia){
             case "Lunes"-> System.out.println("Estudiar");
             case "Martes"-> System.out.println("Trabajar");
            default -> System.out.println("Dia no valido");
        }
        for(int i=1;i<=10; System.out.println(i),i++);
    }
}
