public class AplicacionPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona(66, "Adulto Mayor", "Soltero/a", 1.66, 64.3);

        Persona persona2 = new Persona(34, "Adulto Menor XDXDXD", "Soltero/a", 1.74, 60, true);

        Persona persona3 = new Persona(22, "Adulto Aun Mas Menor XDXDXD", "Soltero/a", 1.78, 70.2, false);

        Persona persona4 = new Persona(17, "Ya no es adulto :(((", "Soltero/a", 1.68, 72.6);

        Persona persona5 = new Persona(99, "Adulto Muy Mayor Xd", "Casado/a", 1.62, 57.7);

        persona1.mostrarinfo();
        persona1.esMayor();
        persona1.genero();
        persona1.imc();

        persona2.mostrarinfo();
        persona2.esMayor();
        persona2.genero();
        persona2.imc();

        persona3.mostrarinfo();
        persona3.esMayor();
        persona3.genero();
        persona3.imc();

        persona4.mostrarinfo();
        persona4.esMayor();
        persona4.genero();
        persona4.imc();

        persona5.mostrarinfo();
        persona5.esMayor();
        persona5.genero();
        persona5.imc();


        
    }
    

    


}
