import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class ControladorCreadorCita {
    private ArrayList<CitaMedica> citasMedicas = new ArrayList<>();
    private int idCitas = 0;
    private boolean existenciaUnica;

    public ArrayList<CitaMedica> getCitasMedicas() {
        citasMedicas.sort(Comparator.comparing(CitaMedica::getIdCita));
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

    public boolean agendarCita (String nobrePaciente, String nombreDoctor, LocalDateTime fecha, String nombreEnfermero, String tipoCita) {
        this.idCitas = this.idCitas + 1;
        CitaMedica citaMedica = new CitaMedica(idCitas, nobrePaciente, nombreDoctor, "Programada", 
        fecha, nombreEnfermero, tipoCita);
        if (citasMedicas.isEmpty() == false) {
            for (CitaMedica citaMedicaPrevia : citasMedicas) {
                if (citaMedicaPrevia.getNombreDoctor().equals(citaMedica.getNombreDoctor()) && 
                citaMedicaPrevia.getTipoCita().equals(citaMedica.getTipoCita())) {
                    if (citaMedicaPrevia.getFecha().equals(citaMedica.getFecha())) {
                        existenciaUnica = false;
                    }
                    else {
                        existenciaUnica = true;
                    }
                }
                else{
                    existenciaUnica = true;
                }
            }
            if (existenciaUnica == true) {
                citasMedicas.add(citaMedica);
            }
            else{
                this.idCitas = this.idCitas - 1;
            }
        }
        else {
            existenciaUnica = true;
            citasMedicas.add(citaMedica);
        }
        return existenciaUnica;
    }
    }   
