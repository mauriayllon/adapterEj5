package ejercicios5.ej1;

public class Tablet implements IArtefactoElectronico {
    private int tiempoDeVida;
    private int precio;

    public Tablet(int tiempoDeVida, int precio) {
        this.tiempoDeVida = tiempoDeVida;
        this.precio = precio;
    }

    @Override
    public int getTiempoDeVida() {
        return 0;
    }

    @Override
    public void precio() {
        System.out.println("El precio de la tablet es de " + precio + "$");
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
