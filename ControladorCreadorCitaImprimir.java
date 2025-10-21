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
    //Partes de la fecha
    private int año;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String nombreEnfermero;
    private String necesitaEnfermero;

    public ControladorCreadorCitaImprimir (){
    }

    public String agendarCita () {
        System.out.println("----- Agendar nueva cita -----");

        System.out.println("Ingrese el nombre del paciente: ");
        nobrePaciente = input1.nextLine();

        System.out.println("¿Qué tipo de médico necesita?: ");
        System.out.println("1. Doctor General");
        System.out.println("2. Cirujano");
        System.out.println("3. Enfermero");
        System.out.println("4. Farmaceutico");
        System.out.println("5. Radiologo");
        System.out.println("6. Terapeuta");
        opcion = input1.nextInt();
        input1.nextLine();
        switch (opcion) {
            case 1:
            for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                System.out.println(doctorGeneral.getId() + ". Doctor disponible: " + doctorGeneral.getNombre());
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (DoctorGeneral doctorGeneral : main.getControladorCreadorImprimir().getControladorCreador().getDoctoresGenerales()) {
                    if (doctorGeneral.getId() == idDoctor) {
                        nombreDoctor = doctorGeneral.getNombre();
                        doctorGeneral.setConsultasAsiganadas();
                    }
                }
                nombreDoctor = input1.nextLine();  
                break;
        
            case 2:
            for (Cirujano cirujano : main.getControladorCreadorImprimir().getControladorCreador().getCirujanos()) {
                System.out.println("Doctor disponible: " + cirujano.getNombre());
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Cirujano cirujano : main.getControladorCreadorImprimir().getControladorCreador().getCirujanos()) {
                    if (cirujano.getId() == idDoctor) {
                        nombreDoctor = cirujano.getNombre();
                        cirujano.setConsultasAsiganadas();
                    } 
                }
                break;

            case 3:
            for (Enfermero enfermero : main.getControladorCreadorImprimir().getControladorCreador().getEnfermeros()) {
                System.out.println("Doctor disponible: " + enfermero.getNombre());
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Enfermero enfermero : main.getControladorCreadorImprimir().getControladorCreador().getEnfermeros()) {
                    if (enfermero.getId() == idDoctor) {
                        nombreDoctor = enfermero.getNombre();
                        enfermero.setConsultasAsiganadas();
                    }
                }
                break;

            case 4:
                for (Farmaceutico farmaceutico : main.getControladorCreadorImprimir().getControladorCreador().getFarmaceuticos()) {
                    System.out.println("Doctor disponible: " + farmaceutico.getNombre());
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Farmaceutico farmaceutico : main.getControladorCreadorImprimir().getControladorCreador().getFarmaceuticos()) {
                    if (farmaceutico.getId() == idDoctor) {
                        nombreDoctor = farmaceutico.getNombre();
                        farmaceutico.setConsultasAsiganadas();
                    }
                }
                break;

            case 5:
            for (Radiologo radiologo : main.getControladorCreadorImprimir().getControladorCreador().getRadiologos()) {
                System.out.println("Doctor disponible: " + radiologo.getNombre());  
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Radiologo radiologo : main.getControladorCreadorImprimir().getControladorCreador().getRadiologos()) {
                    if (radiologo.getId() == idDoctor) {
                        nombreDoctor = radiologo.getNombre();
                        radiologo.setConsultasAsiganadas();
                    }
                }
                break;

            case 6:
            for (Terapeuta terapeuta : main.getControladorCreadorImprimir().getControladorCreador().getTerapeutas()) {
                System.out.println("Doctor disponible: " + terapeuta.getNombre());         
                }
                System.out.println("Ingrese el id del doctor: ");
                idDoctor = input1.nextInt();
                for (Terapeuta terapeuta : main.getControladorCreadorImprimir().getControladorCreador().getTerapeutas()) {
                    if (terapeuta.getId() == idDoctor) {
                        nombreDoctor = terapeuta.getNombre();
                        terapeuta.setConsultasAsiganadas();
                    }
                }
                break;
        }

        System.out.println("Ingrese el año de la cita (YYYY): ");
        año = input2.nextInt();
        System.out.println("Ingrese el mes de la cita (MM): ");
        mes = input2.nextInt();
        System.out.println("Ingrese el día de la cita (dd): ");
        dia = input2.nextInt();
        System.out.println("Ingrese la hora de la cita (formato 24 horas HH): ");
        hora = input2.nextInt();
        System.out.println("Ingrese los minutos de la cita (mm): ");
        minutos = input2.nextInt();
        fecha = LocalDateTime.of(año, mes, dia, hora, minutos);

        System.out.println("¿Requiere de un enfermero para esta cita Y/N?): ");
        necesitaEnfermero = input1.nextLine();
        if (necesitaEnfermero.equals("Y")) {
            System.out.println("Ingrese el nombre del enfermero: ");
            nombreEnfermero = input1.nextLine();
        }
        else {
            nombreEnfermero = null;
        }

        controladorCreadorCita.agendarCita(nobrePaciente, nombreDoctor, fecha, nombreEnfermero);

        return "Cita agendada con éxito";
    }

    public ControladorCreadorCita getControladorCreadorCita() {
        return controladorCreadorCita;
    }
}
