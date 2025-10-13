package TiposDeMedicos;

public class DoctorGeneral extends TrabajadorMedico{

    private String especializacion;
    private int maxCantidad;
    private double tarifaConsulta;

    public DoctorGeneral(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo,
            double salarioBase, String especializacion, int maxCantidadPacientes, double tarifaConsulta) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.especializacion = especializacion; 
        this.maxCantidad = maxCantidadPacientes;
        this.tarifaConsulta = tarifaConsulta;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public int getMaxCantidadPacientes() {
        return maxCantidad;
    }

    public void setMaxCantidadPacientes(int maxCantidad) {
        this.maxCantidad = maxCantidad;
    }

    public double getTarifaConsulta() {
        return tarifaConsulta;
    }

    public void setTarifaConsulta(double tarifaConsulta) {
        this.tarifaConsulta = tarifaConsulta;
    }
    
    @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase + this.consultasAsiganadas*this.tarifaConsulta);
        return this.salarioNeto;
    }
}