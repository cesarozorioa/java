import java.util.Arrays;
import java.util.Scanner;


public class Variables {
    static void main(String[] args) {
        enum dias {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES};
        dias diaSemana=dias.LUNES;
        System.out.println(diaSemana);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el dia de la semana ");
        String diaIngresado = sc.nextLine();
        diaSemana = dias.valueOf(diaIngresado.toUpperCase());
        System.out.println("El dia es ahora :"+diaSemana);

    }
}
