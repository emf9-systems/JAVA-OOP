import  java.util.Date;
public class Publicacion {

    private String titulo;
    private String publicacion;
    private Date fecha;

    public Publicacion(){
        this.fecha = new Date();
    }

    public Publicacion (String titulo, String publicacion){
        this.titulo = titulo;
        this.publicacion = publicacion;
        this.fecha = new Date();
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public String getPublicacion(){
        return this.publicacion;
    }

    public void setPublicacion (String publicacion){
        this.publicacion = publicacion;
    }

    public Date getFecha(){
        return this.fecha;
    }

    public void setFecha (Date fecha){
        this.fecha = new Date();
    }

}
