package TiposDeMedicos;
public class Farmaceutico extends TrabajadorMedico{
    private int maxCantidad;
    private String nivelCertificacion;

    public Farmaceutico(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo,
            double salarioBase, int limitePrescripciones, String nivelCertificacion) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.maxCantidad = limitePrescripciones;
        this.nivelCertificacion = nivelCertificacion;
    }

    public int getLimitePrescripciones() {
        return maxCantidad;
    }

    public void setLimitePrescripciones(int maxCantidad) {
        this.maxCantidad = maxCantidad;
    }

    public String getLicencia() {
        return nivelCertificacion;
    }

    public void setLicencia(String nivelCertificacion) {
        this.nivelCertificacion = nivelCertificacion;
    }
    
    @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase);
        return this.salarioNeto;
    }
}
