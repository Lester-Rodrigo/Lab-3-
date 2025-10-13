package TiposDeMedicos;
public class Cirujano extends TrabajadorMedico{

    private String tipoCirujia;
    private int horasDisponibles;
    private double bono;
    private double tarifaHora;

    public Cirujano(int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase,
     String tipoCirujia, int horasDisponibles, double bono, double tarifaHora) {
        super(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase);
        this.tipoCirujia = tipoCirujia;
        this.horasDisponibles = horasDisponibles;
        this.bono = bono;
        this.tarifaHora = tarifaHora;
    }

    public String getTipoCirujia() {
        return tipoCirujia;
    }

    public void setTipoCirujia(String tipoCirujia) {
        this.tipoCirujia = tipoCirujia;
    }

    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double CalcularSalario () {
        this.salarioNeto = (this.salarioBase + this.bono + this.horasDisponibles*this.tarifaHora);
        return this.salarioNeto;
    }
    
}
