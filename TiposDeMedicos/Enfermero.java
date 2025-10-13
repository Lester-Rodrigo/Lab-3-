package TiposDeMedicos;
public class Enfermero extends TrabajadorMedico{

    private String tipoActividad;
    private String nivelCertificacion;
    private double bonoNocturno;

    public Enfermero(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase, 
    String tipoActividad, String nivelCertificacion) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.tipoActividad = tipoActividad;
        this.nivelCertificacion = nivelCertificacion;
    }

    public String getTipoTurno() {
        return tipoActividad;
    }
    public void setTipoTurno(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
    public String getNivelCertificacion() {
        return nivelCertificacion;
    }
    public void setNivelCertificacion(String nivelCertificacion) {
        this.nivelCertificacion = nivelCertificacion;
    }

    public double getBonoNocturno() {
        return bonoNocturno;
    }

    public void setBonoNocturno(double bonoNocturno) {
        this.bonoNocturno = bonoNocturno;
    }

    @Override
    public double CalcularSalario () {
        if (this.tipoActividad.equals("Nocturno")) {
            this.bonoNocturno = 550.00;
            this.salarioNeto = (this.salarioBase + this.bonoNocturno);
        }
        else {
            this.salarioNeto = this.salarioBase ;
        }
        return this.salarioNeto;
    }
    
}
