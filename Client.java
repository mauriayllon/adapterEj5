package ejercicios5.ej1;

public class Client {

    public static void main(String[] args) {
        Televisor televisor = new Televisor(7, 670);
        Refrigerador refrigerador = new Refrigerador(12, 700);
        Lavadora lavadora = new Lavadora(4, 1000);

        Celular celular = new Celular(3, 400);
        Computadora computadora = new Computadora(5, 400);
        Tablet tablet = new Tablet(5, 700);

        AdaptadorLavadora adaptadorLavadora = new AdaptadorLavadora(lavadora);
        AdaptadorRefrigerador adaptadorRefrigerador = new AdaptadorRefrigerador(refrigerador);
        AdaptadorTelevisor adaptadorTelevisor = new AdaptadorTelevisor(televisor);

        celular.precio();
        computadora.precio();
        tablet.precio();
        adaptadorLavadora.precio();
        adaptadorRefrigerador.precio();
        adaptadorTelevisor.precio();
    }
}
