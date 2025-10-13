package TiposDeMedicos;
public class Terapeuta extends TrabajadorMedico{

    private String especializacion;
    private int duracionTratamiento;
    private double costoTratamiento;

    public Terapeuta(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase,
    String especializacion, int duracionTratamiento, double costoTratamiento) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.especializacion = especializacion;
        this.duracionTratamiento = duracionTratamiento;
        this.costoTratamiento = costoTratamiento;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public int getDuracionTratamiento() {
        return duracionTratamiento;
    }

    public void setDuracionTratamiento(int duracionTratamiento) {
        this.duracionTratamiento = duracionTratamiento;
    }

    public double getCostoTratamiento() {
        return costoTratamiento;
    }

    public void setCostoTratamiento(double costoTratamiento) {
        this.costoTratamiento = costoTratamiento;
    }

    @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase + this.duracionTratamiento*this.costoTratamiento);
        return this.salarioNeto;
    }
    
}
