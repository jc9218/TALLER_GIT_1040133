package taller_git;
/**
 *
 * @author juandmm
 */
public class Jean extends Producto{
    private int cintura;
    private int cadera;
    private int largoEntrepierna;
    private int longitud;
    
    Jean(int cintura, int cadera, int largoEntrepierna, int longitud, String codigo, String nombre, String empresaFabricante,
            String descripcion, String nombreImagen, int precioUnitario, String rangoAplicacPrecio, int descuentoActual,
            String rangoAplicacDescuento, int porcentajeIVA, int unidadesDisponibles){
        super(codigo, nombre, empresaFabricante, descripcion, nombreImagen, precioUnitario, rangoAplicacPrecio, descuentoActual, rangoAplicacDescuento, porcentajeIVA, unidadesDisponibles);
        this.cintura = cintura;
        this.cadera = cadera;
        this.largoEntrepierna = largoEntrepierna;
        this.longitud = longitud;
        System.out.println("Se creó un Jean");
    }
    
    public int getCintura(){
        return cintura;
    }
    
    public int getCadera(){
        return cadera;
    }
    
    public int getLargoEntrepierna(){
        return largoEntrepierna;
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    public void setCintura(int cintura){
        this.cintura = cintura;
    }
    
    public void setCadera(int cadera){
        this.cadera = cadera;
    }
    
    public void setLargoEntrepierna(int largoEntrepierna){
        this.largoEntrepierna = largoEntrepierna;
    }
    
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }    
}
