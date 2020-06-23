package ejercicios5.ej1;

public class AdaptadorTelevisor implements IArtefacto {
    private Televisor televisor;

    public AdaptadorTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public int getTiempo() {
        return televisor.getTiempoDeGarantia();
    }

    @Override
    public void precio() {
        televisor.costo();
    }
}
