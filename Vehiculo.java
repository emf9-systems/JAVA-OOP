public class Vehiculo {
    

    // Atributos del objeto
    private int ano;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

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

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

}
