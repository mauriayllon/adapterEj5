package ejercicios5.ej1;

public class Refrigerador implements IArtefactoDomestico {
    private int tiempoDeGarantia;
    private int costo;

    public Refrigerador(int tiempoDeGarantia, int costo) {
        this.tiempoDeGarantia = tiempoDeGarantia;
        this.costo = costo;
    }

    @Override
    public int getTiempoDeGarantia() {
        return 0;
    }

    @Override
    public void costo() {
        System.out.println("El precio del refrigerador es de " + costo + "$");
    }

    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
