public class Condicional {
    static void main(String[] args) {
        String respuesta1="no";
        String respuesta2="si";
        System.out.println("Quieres un Cafe?");
        System.out.println("respuesta:"+respuesta1);
        if (respuesta1.toLowerCase().trim()=="si"){
            System.out.println("Vas a Comprarlo?");
            System.out.println("Respuesta: "+respuesta2);
            if(respuesta2.toLowerCase().trim()=="si"){
                System.out.println("Comprar Cafe");
            }else{
                System.out.println("Hacemos el cafe");
            }
            System.out.println("Tomamos un cafe");
        }else{
            System.out.println("Seguimos estudiando");
        }
    }
}
