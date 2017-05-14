package mx.com.livmsd.livdiabetic;

/**
 * Created by Fernando Manuel on 14/05/2017.
 */

public class Medicina {
    private int id;
    private String nombre;
    private String cantidad;
    private String imagen;
    public Medicina(int id, String nombre, String cantidad, String imagen) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String titulo) {
        this.nombre = titulo;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public String getCantidad() {
        return cantidad;
    }

    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    @Override
    public String toString() {
        return "mx.com.livmsd.livdiabetic.MedicinaAdaptador.Medicina[id=" + id + ", nombre=" + nombre + ",cantidad="+cantidad+",imagen=" + imagen + "]";
    }

}
