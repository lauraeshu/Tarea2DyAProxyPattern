public class ServicioGaleria implements IntServicioGaleria {

    private String nombreCliente;
    private String direccionCliente ;
    private String fechaEntrega ;
    private int anchoFoto ;
    private int alturaFoto ;

    public ServicioGaleria (String nombreCliente, String direccionCliente,
                            String fechaEntrega, Integer alturaFoto,
                            Integer anchoFoto){

        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.fechaEntrega = fechaEntrega;
        this.alturaFoto= alturaFoto;
        this.anchoFoto= anchoFoto;

        //se cargan los datos desde una BD

        cargarDatos(nombreCliente);


    }



    public void datosFactura() {
        System.out.println("Datos de la factura" +nombreCliente +direccionCliente
        +fechaEntrega);
    }

    @Override
    public void dimensionesFoto() {
        System.out.println("Especificaciones para el marco");
        System.out.println("ancho del marco"+" "+anchoFoto+"cm");
        System.out.println("alto del marco"+" "+alturaFoto+"cm");

    }

    private void cargarDatos(String nombreCliente){
        System.out.println("Los datos de las fotografías de "+nombreCliente +" Estan siendo cargados");

    }
}
