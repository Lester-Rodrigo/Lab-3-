package TiposDeMedicos;
public class TrabajadorMedico {

    protected int id;
    protected String nombre;
    protected String departamenteAsignado;
    protected String tiempoEjerciendo; 
    protected double salarioBase;
    protected double salarioNeto;
    protected int consultasAsiganadas;

    public TrabajadorMedico (int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.departamenteAsignado = departamenteAsignado;
        this.tiempoEjerciendo = tiempoEjerciendo;
        this.salarioBase = salarioBase;
        this.consultasAsiganadas = 0;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDepartamenteAsignado() {
        return departamenteAsignado;
    }
    public void setDepartamenteAsignado(String departamenteAsignado) {
        this.departamenteAsignado = departamenteAsignado;
    }
    public String getTiempoEjerciendo() {
        return tiempoEjerciendo;
    }
    public void setTiempoEjerciendo(String tiempoEjerciendo) {
        this.tiempoEjerciendo = tiempoEjerciendo;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getConsultasAsiganadas() {
        return consultasAsiganadas;
    }
    public void setConsultasAsiganadas(int consultasAsiganadas) {
        this.consultasAsiganadas = this.consultasAsiganadas + consultasAsiganadas;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public double CalcularSalario () {
        return this.salarioNeto;
    }
}