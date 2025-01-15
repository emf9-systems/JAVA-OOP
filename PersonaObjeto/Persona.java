public class Persona {

        // Atributos del objeto
        public int edad;
        public String nombre;
        public String estadoCivil;
        public double altura;
        public double peso;
        public boolean esHombre;
        public boolean esMujer;
        public boolean esMayor;


        public Persona() {};

        public Persona(int edad, String nombre, String estadoCivil, double altura, double peso) {
            this.edad = edad;
            this.nombre = nombre;
            this.estadoCivil = estadoCivil;
            this.altura = altura;
            this.peso = peso;
            this.esHombre = true;
            this.esMujer = false;
        }

        public Persona(int edad, String nombre, String estadoCivil, double altura, double peso, boolean esMujer) {
            this.edad = edad;
            this.nombre = nombre;
            this.estadoCivil = estadoCivil;
            this.altura = altura;
            this.peso = peso;
            this.esHombre = false;
            this.esMujer = esMujer;
        }

        public void imc() {
            double result = this.peso / (this.altura * this.altura);
            System.out.println("Su indice de masa corporal es: "+result);
        }
        public void esMayor() {
            if (this.edad >= 18) {
                System.out.println("Su edad es "+this.edad+" entonces es mayor de edad");
            } else {
                System.out.println("Su edad es "+this.edad+" entonces es menor de edad");
            }
        }

        public void genero() {
            if (this.esHombre == true) {
                String mensaje = "Genero: Masculino";
                System.out.println(mensaje);;
            }
            else if (this.esMujer == true) {
                String mensaje2 = "Genero: Femenino";
                System.out.println(mensaje2);
            }
            else {
                String mensaje3 = "Genero: Otro";
                System.out.println(mensaje3);
            }
        }

        public void mostrarinfo() {
            System.out.println("Nombre: "+this.nombre);
            System.out.println("Estado civil: "+this.estadoCivil);
        }
}

    

