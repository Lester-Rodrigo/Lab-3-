import java.util.ArrayList;
import TiposDeMedicos.*;

public class ControladorCreador {
    //Listas de doctores o departamentos
    private ArrayList<DoctorGeneral> doctoresGenerales = new ArrayList<>();
    private ArrayList<Cirujano> cirujanos = new ArrayList<>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<>();
    private ArrayList<Farmaceutico> farmaceuticos = new ArrayList<>();
    private ArrayList<Radiologo> radiologos = new ArrayList<>();
    private ArrayList<Terapeuta> terapeutas = new ArrayList<>();

    //COntadores de IDs
    private int idDoctorGeneral = 0;
    private int idCirujano = 0;
    private int idEnfermero = 0;
    private int idFarmaceutico = 0;
    private int idRadiologo = 0;
    private int idTerapeuta = 0;

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

    public void nuevoDoctor(int opcion, String nombre, String departamenteAsignado, String tiempoEjerciendo, 
    double salarioBase, String especializacion, int maxCantidad, double tarifaConsulta, String tipoActividad, 
    double bono, String nivelCertificacion, int duracionTratamiento) {
       switch (opcion) {
        case 1:
            idDoctorGeneral = idDoctorGeneral + 1;
            DoctorGeneral doctorGeneral = new DoctorGeneral(idDoctorGeneral, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
            especializacion, maxCantidad, tarifaConsulta);
            doctoresGenerales.add(doctorGeneral);
            break;
       
        case 2:
        idCirujano = idCirujano + 1;
            Cirujano cirujano = new Cirujano(idCirujano, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, tipoActividad, 
            duracionTratamiento, bono, tarifaConsulta);
            cirujanos.add(cirujano);
                
                break;
        
            case 3:
                idEnfermero = idEnfermero + 1;
                Enfermero enfermero = new Enfermero(idEnfermero, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                tipoActividad, nivelCertificacion);
                enfermeros.add(enfermero);
                break;

            case 4:
                idFarmaceutico = idFarmaceutico + 1;
                Farmaceutico farmaceutico = new Farmaceutico(idFarmaceutico, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                maxCantidad, nivelCertificacion);
                farmaceuticos.add(farmaceutico);
                break;

            case 5:
                idRadiologo = idRadiologo + 1;
                Radiologo radiologo = new Radiologo(idRadiologo, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                nivelCertificacion, tarifaConsulta);
                radiologos.add(radiologo);
                break;

            case 6:
                idTerapeuta = idTerapeuta + 1;
                Terapeuta terapeuta = new Terapeuta(idTerapeuta, nombre, departamenteAsignado, tiempoEjerciendo, salarioBase, 
                especializacion, duracionTratamiento, tarifaConsulta);
                terapeutas.add(terapeuta);
                break;
       }
    }
}
