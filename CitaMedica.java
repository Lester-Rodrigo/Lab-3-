import java.time.LocalDateTime;

public class CitaMedica {
    private int idCita;
    private String nobrePaciente;
    private String nombreDoctor;
    private String estadoCita;
    private LocalDateTime fecha;
    private String nombreEnfermero;

    public CitaMedica (int idCita, String nobrePaciente, String nombreDoctor, String estadoCita,
    LocalDateTime fecha,String nombreEnfermero) {
        this.idCita = idCita;
        this.nobrePaciente = nobrePaciente;
        this.nombreDoctor = nombreDoctor;
        this.estadoCita = estadoCita;
        this.fecha = fecha;
        this.nombreEnfermero = nombreEnfermero;
    }

    public int getIdCita() {
        return idCita;
    }
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }
    public String getNobrePaciente() {
        return nobrePaciente;
    }
    public void setNobrePaciente(String nobrePaciente) {
        this.nobrePaciente = nobrePaciente;
    }
    public String getNombreDoctor() {
        return nombreDoctor;
    }
    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }
    public String getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

     public String getNombreEnfermero() {
        return nombreEnfermero;
    }
    public void setNombreEnfermero(String nombreEnfermero) {
        this.nombreEnfermero = nombreEnfermero;
    }
}
