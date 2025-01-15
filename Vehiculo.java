public class Vehiculo {
    

    // Atributos del objeto
    public int ano;
    public String marca;
    public String modelo;
    public String color;
    public int ruedas;

    // Metodo constructor: encargado de inicializar la instancia
    public Vehiculo() {
        // Cree un nuevo vehiculo


    }
    // SOBRECARGA DE METODO CONSTRUCTOR
    public Vehiculo(String color) {
        this.color = color;
    }

    public Vehiculo(int ano, String marca, String modelo) {
        this.color = "Blanco";
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = 4;
    }


    public Vehiculo(int ano, String color, String marca, String modelo) {
        this.color = color;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = 4;
    }



    public Vehiculo(int ano, String color, String marca, String modelo, int ruedas) {
        this.color = color;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = ruedas;
    }

    public void encender() {
        System.out.println("El vehiculo de color "+this.color+" y marca "+this.marca+" esta encendido");
    }

}
