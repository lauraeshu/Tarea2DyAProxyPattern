public class Proxy implements IntServicioGaleria{

    private ServicioGaleria servicioGaleria;
    private int anchoFoto ;
    private int alturaFoto ;
    private String nombreCliente;
    private String direccionCliente ;
    private String fechaEntrega ;

    public Proxy (int anchoFoto, int alturaFoto, String nombreCliente
    , String direccionCliente, String fechaEntrega){
        this.alturaFoto = alturaFoto;
        this.anchoFoto= anchoFoto;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.fechaEntrega = fechaEntrega;


    }

    @Override
    public void dimensionesFoto() {
        servicioGaleria = new ServicioGaleria(nombreCliente,direccionCliente,fechaEntrega,alturaFoto,anchoFoto);
        servicioGaleria.dimensionesFoto();
    }
}
