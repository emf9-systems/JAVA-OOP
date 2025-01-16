import java.util.ArrayList;

public class Usuario {
    
    private String nombre;
    private int edad;
    private String email;

    private ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();

    public Usuario(){}

    public Usuario (String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEded (int edad){
        this.edad = edad;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public void agregarPublicacion(String tituloPublicacion, String contenidoPublicacion){
        Publicacion nuevaPublicacion = new Publicacion(tituloPublicacion, contenidoPublicacion);
        
        System.out.println(" ");
        System.out.println("Generando publicacion: "+tituloPublicacion+" / Creada por: "+this.nombre+" / Fecha: "+nuevaPublicacion.getFecha());
        System.out.println(" ");
        System.out.println("<------------------------------o------------------------------------->");
        System.out.println(" ");

        this.publicaciones.add(nuevaPublicacion);

    }

    public void muestrePublicaciones() {
        System.out.println("Mostrando publicaciones de: "+this.nombre);

        for(Publicacion p : this.publicaciones) {
            System.out.println(" ");
            System.out.println("Titulo: "+p.getTitulo());
            System.out.println("Contenido: "+p.getPublicacion());
            System.out.println("Fecha: "+p.getFecha());
            System.out.println(" ");

            System.out.println("<------------------------------o------------------------------------->");
        }
    }


}
