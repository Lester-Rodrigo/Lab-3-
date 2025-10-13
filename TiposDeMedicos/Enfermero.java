package TiposDeMedicos;
public class Enfermero extends TrabajadorMedico{

    private String tipoTurno;
    private String nivelCertificacion;
    private double bonoNocturno;

    public Enfermero(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase, String tipoTurno,
     String nivelCertificacion) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.tipoTurno = tipoTurno;
        this.nivelCertificacion = nivelCertificacion;
    }

    public String getTipoTurno() {
        return tipoTurno;
    }
    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
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
        if (this.tipoTurno.equals("Nocturno")) {
            this.bonoNocturno = 550.00;
            this.salarioNeto = (this.salarioBase + this.bonoNocturno);
        }
        else {
            this.salarioNeto = this.salarioBase ;
        }
        return this.salarioNeto;
    }
    
}
