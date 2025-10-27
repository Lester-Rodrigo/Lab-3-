package TiposDeMedicos;
public class Radiologo extends TrabajadorMedico{
    
    private String nivelCertificacion;
    private double tarifaConsulta;

    public Radiologo(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase,
    String nivelCertificacion, double tarifaConsulta) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.nivelCertificacion = nivelCertificacion;
        this.tarifaConsulta = tarifaConsulta;
    }

    public String getEquipoCertificado() {
        return nivelCertificacion;
    }

    public void setEquipoCertificado(String nivelCertificacion) {
        this.nivelCertificacion = nivelCertificacion;
    }

    public double getTarifaEstudio() {
        return tarifaConsulta;
    }

    public void setTarifaEstudio(double tarifaConsulta) {
        this.tarifaConsulta = tarifaConsulta;
    }

     @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase + this.getConsultasAsiganadas()*this.tarifaConsulta);
        return this.salarioNeto;
    }
    
}
