import java.util.Arrays;

public class PruebaFunciones {
    static void main(String[] args) {
        System.out.println("El valor de variable = "+Funciones.variable);
        var obj3 = new Funciones();
        System.out.println("variable = "+obj3.valor);
        obj3.valor = 50;
        System.out.println("variable = "+obj3.valor);
        int [] notas = new int[5];
        int [] valores={12,1,5,6,4};
        System.out.println(notas);
        System.out.println(Arrays.toString(notas));
        int [][][] tablas = new int[3][3][3];
        System.out.println(Arrays.deepToString(tablas));
        tablas [1][0][0]=10;
        System.out.println(Arrays.deepToString(tablas));
        System.out.println("Longitud de valores "+valores.length);
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        System.out.println("La suma de los elementos = "+sumaElementos(valores));
        ordenaElementos(valores);
        System.out.println(Arrays.toString(valores));
        int resultadoSuma=sumaValores(2,3);//elementos individuales
        System.out.println("Valor de resultado "+resultadoSuma);
    }
    static int sumaElementos(int [] num){
        int resultado = 0;
        for(int numero:num){
            resultado+=numero;
        }
        return resultado;
    }
    static void ordenaElementos(int [] datos){
        int temp;
        for (int i=0;i<datos.length/2;i++){
            temp = datos[i];
            datos[i]=datos[datos.length-1-i];
            datos[datos.length-1-i]=temp;
        }

    }
    static int sumaValores(int... numeros){//numeros es un array
        int resultado=0;
        for (int numero:numeros){
            resultado+=numero;

        }
        return resultado;
    }
}
