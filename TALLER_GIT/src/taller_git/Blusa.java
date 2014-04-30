/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_git;

/**
 *
 * @author Juan Camilo
 */
public class Blusa extends Producto{
    private int largoMangas;
    private int anchoPecho;
    private int cintura;
    
    Blusa(int largoMangas, int anchoPecho, int cintura, String codigo, String nombre, String empresaFabricante,
            String descripcion, String nombreImagen, int precioUnitario, String rangoAplicacPrecio, int descuentoActual,
            String rangoAplicacDescuento, int porcentajeIVA, int unidadesDisponibles){
        super(codigo, nombre, empresaFabricante, descripcion, nombreImagen, precioUnitario, rangoAplicacPrecio, descuentoActual, rangoAplicacDescuento, porcentajeIVA, unidadesDisponibles);
        this.largoMangas = largoMangas;
        this.anchoPecho = anchoPecho;
        this.cintura = cintura;        
        System.out.println("Se creo una blusa");
    }
    
    public int getLargoMangas(){
        return largoMangas;
    }
    
    public int getAnchoPecho(){
        return anchoPecho;
    }
    
    public int getCintura(){
        return cintura;
    }
    
    public void setLargoMangas(int largoMangas){
        this.largoMangas = largoMangas;
    }
    
    public void setAnchoPecho(int anchoPecho){
        this.anchoPecho = anchoPecho;
    }
    
    public void setCintura(int cintura){
        this.cintura = cintura;
    }
}
