import java.util.Scanner;

public class PatronProxy {
    public static void main(String[] args) {

        String cliente ;
        Scanner entradaEscaner = new Scanner(System.in);
        cliente = (entradaEscaner.nextLine() );


        if (cliente.equals("Marco") || cliente.equals("marco")){
            IntServicioGaleria intServicioGaleria = new Proxy(
                    13,
                    12,
                    "leonard nimoy",
                    "calle 445",
                    " 14 abril");

            intServicioGaleria.dimensionesFoto();
            System.out.println(".........");

        }else if (cliente.equals("Admin") || cliente.equals("admin")){
            System.out.println("Los datos a los que quiere acceder son de tipo administrativo " +

                    "Comuniquese con la extensión 455 para obtener los permisos");
        }





    }
}
