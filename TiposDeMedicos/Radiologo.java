package TiposDeMedicos;
public class Radiologo extends TrabajadorMedico{
    private String equipoCertificado;
    private double tarifaEstudio;

    public Radiologo(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase,
    String equipoCertificado, double tarifaEstudio) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.equipoCertificado = equipoCertificado;
        this.tarifaEstudio = tarifaEstudio;
    }

    public String getEquipoCertificado() {
        return equipoCertificado;
    }

    public void setEquipoCertificado(String equipoCertificado) {
        this.equipoCertificado = equipoCertificado;
    }

    public double getTarifaEstudio() {
        return tarifaEstudio;
    }

    public void setTarifaEstudio(double tarifaEstudio) {
        this.tarifaEstudio = tarifaEstudio;
    }

     @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase + this.tarifaEstudio);
        return this.salarioNeto;
    }
    
}
