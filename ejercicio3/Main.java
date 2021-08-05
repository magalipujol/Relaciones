public class Main {
    public static void main(String[] args) {
       
        Baraja baraja = new Baraja();

        baraja.crearMazo();

        baraja.barajar();

        System.out.println("BARAJA: " + baraja);

        System.out.println("MANO: " + baraja.darCartas(39));

        baraja.siguienteCarta();

        System.out.println("BARAJA: " + baraja);
        baraja.siguienteCarta();
        System.out.println("BARAJA: " + baraja);


    }
}
