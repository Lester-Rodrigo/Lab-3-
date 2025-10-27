package TiposDeMedicos;
public class Terapeuta extends TrabajadorMedico{

    private String especializacion;
    private int duracionTratamiento;
    private double tarifaConsulta;

    public Terapeuta(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase,
    String especializacion, int duracionTratamiento, double tarifaConsulta) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.especializacion = especializacion;
        this.duracionTratamiento = duracionTratamiento;
        this.tarifaConsulta = tarifaConsulta;
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
        return tarifaConsulta;
    }

    public void setCostoTratamiento(double tarifaConsulta) {
        this.tarifaConsulta = tarifaConsulta;
    }

    @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase + this.getConsultasAsiganadas()*(this.duracionTratamiento*this.tarifaConsulta));
        return this.salarioNeto;
    }
    
}
