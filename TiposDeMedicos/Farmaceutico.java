package TiposDeMedicos;
public class Farmaceutico extends TrabajadorMedico{
    private int limitePrescripciones;
    private String licencia;

    public Farmaceutico(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo,
            double salarioBase, int limitePrescripciones, String licencia) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.limitePrescripciones = limitePrescripciones;
        this.licencia = licencia;
    }

    public int getLimitePrescripciones() {
        return limitePrescripciones;
    }

    public void setLimitePrescripciones(int limitePrescripciones) {
        this.limitePrescripciones = limitePrescripciones;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase);
        return this.salarioNeto;
    }
}
