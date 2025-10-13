package TiposDeMedicos;
public class Cirujano extends TrabajadorMedico{

    private String tipoActividad;
    private int duracionTratamiento;
    private double bono;
    private double tarifaConsulta;

    public Cirujano(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase,
     String tipoActividad, int duracionTratamiento, double bono, double tarifaHora) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.tipoActividad = tipoActividad;
        this.duracionTratamiento = duracionTratamiento;
        this.bono = bono;
        this.tarifaConsulta = tarifaHora;
    }

    public String getTipoCirujia() {
        return tipoActividad;
    }

    public void setTipoCirujia(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public int getHorasDisponibles() {
        return duracionTratamiento;
    }

    public void setHorasDisponibles(int duracionTratamiento) {
        this.duracionTratamiento = duracionTratamiento;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getTarifaHora() {
        return tarifaConsulta;
    }

    public void setTarifaHora(double tarifaConsulta) {
        this.tarifaConsulta = tarifaConsulta;
    }

    @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase + this.bono + this.duracionTratamiento*this.tarifaConsulta);
        return this.salarioNeto;
    }
    
}
