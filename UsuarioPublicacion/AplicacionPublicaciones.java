public class AplicacionPublicaciones {

    public static void main(String[] args) {
        
        Usuario quandale = new Usuario("Quandale Dingle", 666, "quandaledinglehere@RUUEHEHE.com");

        Usuario donPollo = new Usuario("Don Pollo", 49, "salsaypicante@lingangulinga.gu");

        donPollo.agregarPublicacion("UN VIDEO MA PA PELDEL EL TIEMPO EMPECEMO", "Ete e un video ma mi gente pa peldel el tiempo empecemo, si tu quiere peldel tu tiempo, pieldelo en mi perfil...");

        quandale.agregarPublicacion("QUANDALE DINGLE HERE!!!", "What's up guys! It's Quandale Dingle here! (RUUEHEHEHEHEHEEHE) I have been arrested for multiple crimes (AHHHHHHHHHHHHH) including: Battery on a police officer (WHAT), Grand theft, Declaring war on Italy, and public indecency (RUHEHEHEEHEHEHEHEHEHEHE X2 speed). I will be escaping prison on, MARCH 28TH! After that.... I WILL TAKE OVER THE WORLD");

        quandale.agregarPublicacion("QUANDALE DINGLE HERE!!! PART 2", "Greetings, Quandale Dingle here. My cousin Henry Bartholomew Dinglenut got arrested for putting a TNT in a daycare center. I put a camera in Joe Biden's bathroom and watched him take a poo. My Asian brother Quanlingling Dingle put illegal substances in my ramen and I died");


        quandale.muestrePublicaciones();
    }
}
