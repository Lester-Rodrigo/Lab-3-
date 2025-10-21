import java.time.LocalDateTime;
import java.util.ArrayList;

public class ControladorCreadorCita {
    private ArrayList<CitaMedica> citasMedicas = new ArrayList<>();
    private int idCitas = 0;

    public ArrayList<CitaMedica> getCitasMedicas() {
        return citasMedicas;
    }

    public int getIdCItas() {
        return idCitas;
    }

    public void setIdCItas() {
        this.idCitas = this.idCitas + 1;
    }

    public ControladorCreadorCita() {
    } 

    public void agendarCita (String nobrePaciente, String nombreDoctor, LocalDateTime fecha, String nombreEnfermero) {
        idCitas = idCitas + 1;
        CitaMedica citaMedica = new CitaMedica(idCitas, nobrePaciente, nombreDoctor, "Programada", 
        fecha, nombreEnfermero);
        citasMedicas.add(citaMedica);
    }
    }   
