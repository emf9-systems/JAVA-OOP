public class Aplicacion {
    
    public static void main(String[] args) {
        


        // Crear nuevo vehiculo

        Vehiculo auto1 = new Vehiculo();

        auto1.ano = 1996;
        auto1.marca = "Honda";
        auto1.modelo = "Civic (Hatchback)";
        auto1.color = "Verde";
        auto1.ruedas = 4;

        Vehiculo autoRojo = new Vehiculo("rojo");

        Vehiculo autoCompleto = new Vehiculo(1997, "Suzuki", "Maruti");

        Vehiculo autoCompleto2 = new Vehiculo(2006, "rojo", "Mazda", "RX-8 (coupe)");

        Vehiculo motocicleta = new Vehiculo(2025, "negra", "Yamaha", "YZF-R3", 2);

        System.out.println("auto1 modelo: "+auto1.modelo);

        System.out.println("autoRojo color: "+autoRojo.color);

        System.out.println("autoCompleto color y modelo: "+autoCompleto.color+" "+autoCompleto.modelo);

        System.out.println("autoCompleto2 ruedas, color y modelo: "+autoCompleto2.ruedas+" "+autoCompleto2.color+" "+autoCompleto2.modelo+" ");
        
        System.out.println("motocicleta ruedas, modelo y año:"+motocicleta.ruedas+" "+motocicleta.modelo+" "+motocicleta.ano+" ");

        autoCompleto.encender();





    }

}
