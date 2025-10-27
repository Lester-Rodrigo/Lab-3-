import java.time.LocalDateTime;
import java.util.Scanner;

import TiposDeMedicos.Cirujano;
import TiposDeMedicos.DoctorGeneral;
import TiposDeMedicos.Enfermero;
import TiposDeMedicos.Farmaceutico;
import TiposDeMedicos.Radiologo;
import TiposDeMedicos.Terapeuta;

public class ControladorCreadorCitaImprimir {

    ControladorCreadorCita controladorCreadorCita = new ControladorCreadorCita();
    Main main = new Main();

    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    private int opcion;

    private int idDoctor;
    private String nobrePaciente;
    private String nombreDoctor;
    private LocalDateTime fecha;
    private String tipoCita;
    private String nombreEnfermero;
    private String necesitaEnfermero;
    private String citaUnica;
    //Partes de la fecha
    private int year;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    public ControladorCreadorCitaImprimir (){
    }

    public String agendarCita () {
        System.out.println("----- Agendar nueva cita -----");

        System.out.println("Ingrese el nombre del paciente: ");
        nobrePaciente = input1.nextLine();

        System.out.println("¿Qué tipo de médico necesita?: ");
        System.out.println("1. Doctor General");
        System.out.println("2. Cirujano");
        System.out.println("3. Farmaceutico");
        System.out.println("4. Radiologo");
        System.out.println("5. Terapeuta");
        System.out.println("Seleccione una opción del 1 al 5: ");
        opcion = input1.nextInt();
        input1.nextLine();
        switch (opcion) {
            case 1:
            for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                System.out.println("Doctor disponible: " +doctorGeneral.getId()+ ") " + doctorGeneral.getNombre());
                }
                tipoCita = "Medicina General";
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                    if (doctorGeneral.getId() == idDoctor) {
                        nombreDoctor = doctorGeneral.getNombre();
                        doctorGeneral.setConsultasAsiganadas(1);
                    }
                }
                break;
        
            case 2:
            tipoCita = "Cirugia";
            for (Cirujano cirujano : main.getControladorCreadorImprimir().getControladorCreador().getCirujanos()) {
                System.out.println("Doctor disponible: " +cirujano.getId()+ ") " + cirujano.getNombre());
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Cirujano cirujano : main.getControladorCreadorImprimir().getControladorCreador().getCirujanos()) {
                    if (cirujano.getId() == idDoctor) {
                        nombreDoctor = cirujano.getNombre();
                        cirujano.setConsultasAsiganadas(1);
                    } 
                }
                break;

            case 3:
            tipoCita = "Farmaceutica";
                for (Farmaceutico farmaceutico : main.getControladorCreadorImprimir().getControladorCreador().getFarmaceuticos()) {
                    System.out.println("Doctor disponible: " +farmaceutico.getId()+ ") " + farmaceutico.getNombre());
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Farmaceutico farmaceutico : main.getControladorCreadorImprimir().getControladorCreador().getFarmaceuticos()) {
                    if (farmaceutico.getId() == idDoctor) {
                        nombreDoctor = farmaceutico.getNombre();
                        farmaceutico.setConsultasAsiganadas(1);
                    }
                }
                break;

            case 4:
            tipoCita = "Radiologia";
            for (Radiologo radiologo : main.getControladorCreadorImprimir().getControladorCreador().getRadiologos()) {
                System.out.println("Doctor disponible: " +radiologo.getId()+ ") " + radiologo.getNombre());  
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Radiologo radiologo : main.getControladorCreadorImprimir().getControladorCreador().getRadiologos()) {
                    if (radiologo.getId() == idDoctor) {
                        nombreDoctor = radiologo.getNombre();
                        radiologo.setConsultasAsiganadas(1);
                    }
                }
                break;

            case 5:
            tipoCita = "Terapia";
            for (Terapeuta terapeuta : main.getControladorCreadorImprimir().getControladorCreador().getTerapeutas()) {
                System.out.println("Doctor disponible: " +terapeuta.getId()+ ") " + terapeuta.getNombre());         
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Terapeuta terapeuta : main.getControladorCreadorImprimir().getControladorCreador().getTerapeutas()) {
                    if (terapeuta.getId() == idDoctor) {
                        nombreDoctor = terapeuta.getNombre();
                        terapeuta.setConsultasAsiganadas(1);
                    }
                }
                break;
        }

        System.out.println("Ingrese el año de la cita (YYYY): ");
        year = input2.nextInt();
        System.out.println("Ingrese el mes de la cita (MM): ");
        mes = input2.nextInt();
        System.out.println("Ingrese el día de la cita (dd): ");
        dia = input2.nextInt();
        System.out.println("Ingrese la hora de la cita (formato 24 horas HH): ");
        hora = input2.nextInt();
        System.out.println("Ingrese los minutos de la cita (mm): ");
        minutos = input2.nextInt();
        fecha = LocalDateTime.of(year, mes, dia, hora, minutos);

        input1.nextLine();
        System.out.println("¿Requiere de un enfermero para esta cita Y/N?): ");
        necesitaEnfermero = input1.nextLine();
        necesitaEnfermero = necesitaEnfermero.toUpperCase();
        if (necesitaEnfermero.equals("Y")) {
            for (Enfermero enfermero : main.getControladorCreadorImprimir().getControladorCreador().getEnfermeros()) {
                System.out.println("Enfermero disponible: " +enfermero.getId()+ ") " + enfermero.getNombre());
                }
                System.out.println("Ingrese el id del enfermero: ");
                idDoctor = input1.nextInt();
                for (Enfermero enfermero : main.getControladorCreadorImprimir().getControladorCreador().getEnfermeros()) {
                    if (enfermero.getId() == idDoctor) {
                        nombreEnfermero = enfermero.getNombre();
                        enfermero.setConsultasAsiganadas(1);
                    }
                }
        }
        else {
            nombreEnfermero = null;
        }

        if (controladorCreadorCita.agendarCita(nobrePaciente, nombreDoctor, fecha, nombreEnfermero, tipoCita) == false 
        && tipoCita.equals("Medicina General")) {
            for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                if (nombreDoctor.equals(doctorGeneral.getNombre())) {
                    doctorGeneral.setConsultasAsiganadas( -1);
                    citaUnica = ("Error: El doctor ya tiene una cita agendada en esa fecha y hora.");
                }
            }
        }
        else {
            citaUnica = ("Cita agendada con éxito");
        }
        return citaUnica;
    }

    public ControladorCreadorCita getControladorCreadorCita() {
        return controladorCreadorCita;
    }
}
