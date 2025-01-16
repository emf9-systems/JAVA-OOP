public class Aplicacion {
    
    public static void main(String[] args) {
        


        // Crear nuevo vehiculo

        Vehiculo auto1 = new Vehiculo();

        // auto1.ano = 1996;
        auto1.setAno(1996);
        // auto1.marca = "Honda";
        auto1.setMarca("Honda");
        // auto1.modelo = "Civic (Hatchback)";
        auto1.setModelo("Civic");
        // auto1.color = "Verde";
        auto1.setColor("Verde");
        // auto1.ruedas = 4;
        auto1.setRuedas(4);

        Vehiculo autoRojo = new Vehiculo("rojo");

        Vehiculo autoCompleto = new Vehiculo(1997, "Suzuki", "Maruti");

        Vehiculo autoCompleto2 = new Vehiculo(2006, "rojo", "Mazda", "RX-8 (coupe)");

        Vehiculo motocicleta = new Vehiculo(2025, "negra", "Yamaha", "YZF-R3", 2);

        System.out.println("auto1 modelo: "+auto1.getModelo());

        System.out.println("autoRojo color: "+autoRojo.getColor());

        System.out.println("autoCompleto color y modelo: "+autoCompleto.getColor()+" "+autoCompleto.getModelo());

        System.out.println("autoCompleto2 ruedas, color y modelo: "+autoCompleto2.getRuedas()+" "+autoCompleto2.getColor()+" "+autoCompleto2.getModelo());
        
        System.out.println("motocicleta ruedas, modelo y año:"+motocicleta.getRuedas()+" "+motocicleta.getModelo()+" "+motocicleta.getAno());

        autoCompleto.encender();

        Vehiculo.esAutomotora();





    }

}
