import java.util.ArrayList;
import TiposDeMedicos.*;

public class ControladorCreador {
    private ArrayList<DoctorGeneral> doctoresGenerales = new ArrayList<>();
    private ArrayList<Cirujano> cirujanos = new ArrayList<>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<>();
    private ArrayList<Farmaceutico> farmaceuticos = new ArrayList<>();
    private ArrayList<Radiologo> radiologos = new ArrayList<>();
    private ArrayList<Terapeuta> terapeutas = new ArrayList<>();

    public ArrayList<DoctorGeneral> getDoctoresGenerales() {
        return doctoresGenerales;
    }

    public ArrayList<Cirujano> getCirujanos() {
        return cirujanos;
    }

    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public ArrayList<Farmaceutico> getFarmaceuticos() {
        return farmaceuticos;
    }

    public ArrayList<Radiologo> getRadiologos() {
        return radiologos;
    }

    public ArrayList<Terapeuta> getTerapeutas() {
        return terapeutas;
    }

    public ControladorCreador (){
    }

    public void nuevoDoctor(int opcion, int id, String nombre, String departamenteAsignado, String tiempoEjerciendo, 
    double salarioBase, String especializacion, int maxCantidad, double tarifaConsulta, String tipoActividad, 
    double bono, String nivelCertificacion, int duracionTratamiento) {
       switch (opcion) {
        case 1:
            DoctorGeneral doctorGeneral = new DoctorGeneral(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
            especializacion, maxCantidad, tarifaConsulta);
            doctoresGenerales.add(doctorGeneral);
            break;
       
        case 2:
            Cirujano cirujano = new Cirujano(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, tipoActividad, 
            duracionTratamiento, bono, tarifaConsulta);
            cirujanos.add(cirujano);
                
                break;
        
            case 3:
                Enfermero enfermero = new Enfermero(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                tipoActividad, nivelCertificacion);
                enfermeros.add(enfermero);
                break;

            case 4:
                Farmaceutico farmaceutico = new Farmaceutico(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                maxCantidad, nivelCertificacion);
                farmaceuticos.add(farmaceutico);
                break;

            case 5:
                Radiologo radiologo = new Radiologo(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                nivelCertificacion, tarifaConsulta);
                radiologos.add(radiologo);
                break;

            case 6:
                Terapeuta terapeuta = new Terapeuta(id, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                especializacion, duracionTratamiento, tarifaConsulta);
                terapeutas.add(terapeuta);
                break;
       }
    }
}
