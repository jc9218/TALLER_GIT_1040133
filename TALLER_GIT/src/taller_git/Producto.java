package taller_git;
/**
 *
 * @author juandmm
 */
public abstract class Producto {
    
    private String codigo;
    private String nombre;
    private String empresaFabricante;
    private String descripcion;
    private String nombreImagen;
    private int precioUnitario;
    private String rangoAplicacPrecio;
    private int descuentoActual;
    private String rangoAplicacDescuento;
    private int porcentajeIVA;
    private int unidadesDisponibles;
    
    public Producto(){}
    
    public Producto(String codigo, String nombre, String empresaFabricante,String descripcion, String nombreImagen, 
            int precioUnitario, String rangoAplicacPrecio, int descuentoActual,String rangoAplicacDescuento, 
            int porcentajeIVA, int unidadesDisponibles){
        this.codigo = codigo;
        this.nombre = nombre;
        this.empresaFabricante = empresaFabricante;
        this.descripcion = descripcion;
        this.nombreImagen = nombreImagen;
        this.precioUnitario = precioUnitario;
        this.rangoAplicacPrecio = rangoAplicacPrecio;
        this.descuentoActual = descuentoActual;
        this.rangoAplicacDescuento = rangoAplicacDescuento;
        this.porcentajeIVA = porcentajeIVA;
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEmpresaFabricante(){
        return empresaFabricante;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getNombreImagen(){
        return nombreImagen;
    }
    public int getPrecioUnitario(){
        return precioUnitario;
    }
    public String getRangoAplicacPrecio(){
        return rangoAplicacPrecio;
    }
    public int getDescuentoActual(){
        return descuentoActual;
    }
    public String getRangoAplicacDescuento(){
        return rangoAplicacDescuento;
    }
    public int getPorcentajeIVA(){
        return porcentajeIVA;
    }
    public int getUnidadesDisponibles(){
        return unidadesDisponibles;
    }   
}
