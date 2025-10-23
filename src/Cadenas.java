public class Cadenas {
    static void main(String[] args) {
        //actualizado en github
        String cadena1 = "Mundo";
        String cadena2= new String("Mundo");
        if (cadena1==cadena2){
            System.out.println("Cadenas Iguales");
        }else{
            System.out.println("Cadenas no iguales");
        }
        if (cadena1.equals(cadena2)){
            System.out.println("Cadenas Iguales");
        }
    }
}
